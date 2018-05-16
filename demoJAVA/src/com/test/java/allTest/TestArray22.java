package com.test.java.allTest;

import java.util.Arrays;

/**
 * 练习数组的排序
 * @author xpp
 *
 */
public class TestArray22 {
	
	public static void main(String[] args) {
		int[] array = {20,10,48,9,87,87,55,441};
		selectSort(array);
		System.out.println("选择排序："+Arrays.toString(array));
		
		int[] array2 = {20,10,48,9,87,87,55,441};
		bubbleSort1(array2);
		System.out.println("冒泡排序1："+Arrays.toString(array2));
		
		int[] array3 = {20,10,48,9,87,87,55,441};
		bubbleSort2(array3);
		System.out.println("冒泡排序2："+Arrays.toString(array3));
		
		int[] array4 = {20,10,48,9,87,87,55,441};
		quickSort(array4);
		System.out.println("快速排序："+Arrays.toString(array4));
		
		
	}
	
	/**
	 * 选择排序
	 * @param array
	 */
	public static void selectSort(int[] array) {
		
		for(int x=0;x<array.length-1;x++) {
			for(int y=x+1;y<array.length;y++) {
				if(array[x]<array[y]) {
					int temp = array[y];
					array[y] = array[x];
					array[x] = temp;
				}
			}
		}
	}
	
	/**
	 * 冒泡排序1
	 * @param array
	 */
	public static void bubbleSort1(int[] array) {
		for(int x=0;x<array.length-1;x++) {
			for(int y=0;y<array.length-1-x;y++) {
				if(array[y]<array[y+1]) {
					int temp = array[y+1];
					array[y+1] = array[y];
					array[y] = temp;
				}
			}
		}
	}
	/**
	 * 冒泡排序2
	 * @param array
	 */
	public static void bubbleSort2(int[] array) {
		for(int x=array.length-1;x>0;x--) {
			for(int y=0;y<x;y++) {
				if(array[y]<array[y+1]) {
					int temp = array[y+1];
					array[y+1] = array[y];
					array[y] = temp;
				}
			}
		}
	}
	
	/**
	 * 快速排序（这种效率是最高的）
	 * @param array
	 */
	public static void quickSort(int[] array) {
		for(int x=0;x<array.length-1;x++) {
			int element = array[x];
			int index = x;
			for(int y=x+1;y<array.length;y++) {
				//此处可以理解为就是array[x]和array[y]进行大小的比较
				if(element < array[y]) {
					element = array[y];
					index = y;
				}
			}
			if(index !=x) {
				int temp = array[x];
				array[x] = array[index]; 
				array[index] = temp;
			}
		}
	}
}
