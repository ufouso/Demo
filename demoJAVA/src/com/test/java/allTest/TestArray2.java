package com.test.java.allTest;

import java.util.Arrays;
/**
 * 排序方法
 * @author xpp
 *
 */
public class TestArray2 {
	
	public static void main(String[] args) {
		int[] a = {12,45,2,400,15,117};
		sortArray(a);
		System.out.println("选择排序："+Arrays.toString(a));
		
		int[] a2 = {12,45,2,400,15,117};
		sortArray2(a2);
		System.out.println("冒泡排序1："+Arrays.toString(a2));
		
		int[] a3 = {12,45,2,400,15,117};
		sortArray3(a3);
		System.out.println("冒泡排序2："+Arrays.toString(a3));
		
		int[] a4 = {12,45,2,400,15,117};
		Arrays.sort(a4);
		System.out.println(Arrays.toString(a4));
		
		System.out.println("-----------------------------");
		int[] a5 = {12,45,2,400,15,117};
		sortArray4(a5);
		System.out.println("快速排序："+Arrays.toString(a5));
		
	}
	
	/**
	 * 位置互换
	 */
	public static void changePosition(int[] array,int x,int y) {
		int temp = array[x];
		array[x] = array[y]; 
		array[y] = temp;
	}
	
	
	/**
	 * 选择排序法
	 * @param array
	 */
	public static void sortArray(int[] array) {
		//选择排序，外循环的条件减一原因是因为最后一个数不用比较了
		for(int x=0;x<array.length-1;x++) {
			//y=x+1,是因为需要和后面一个数比较
			for(int y=x+1;y<array.length;y++) {
				if(array[x] < array[y]) {
					changePosition(array, x, y);
				}
			}
		}
	}
	
	/**
	 * 冒泡排序法第一种
	 * @param array
	 */
	public static void sortArray2(int[] array) {
		for(int x=0;x<array.length-1;x++) {
			
			//此处减一是：为了避免数组下标越界
			//此处减x是： 为了让外循环增加一次，内循环参数与比较的元素个数递减。
			for(int y=0;y<array.length-1-x;y++) {
				if(array[y]>array[y+1]) {
					changePosition(array, y, y+1);
				}
			}
		}
	}
	
	public static void sortArray3(int[] array) {
		for(int x=array.length-1;x>0;x--) {
			for(int y=0;y<x;y++) {
				if(array[y]>array[y+1]) {
					changePosition(array, y, y+1);
				}
			}
		}
	}
	
	/**
	 * 快速排序，效率高
	 * @param array
	 */
	public static void  sortArray4(int[] array) {
		
		for(int x=0;x<array.length-1;x++) {
			int num = array[x];
			int index = x;
			for(int y = x+1;y<array.length;y++) {
				if(num >array[y]) {
					num = array[y];
					index = y;
				}
			}
			if(index !=x) {
				changePosition(array, x, index);
			}
		}
		
	}
	
}
