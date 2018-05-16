package com.test.java.allTest;

/**
 * 查找元素,二分查找法。
 * @author xpp
 *
 */
public class TestArray3 {

	public static void main(String[] args) {
		int[] array = {21,23,43,65,75,88,90};
		System.out.println(findOne(array, 90));
	
		//这个是java自己封装的api，但是如果找不到的情况下，这个返回的是负数，
//		并且这个数是在该数组中插入后保持顺序不变的位置加上1之后再变成负数
//		int a = Arrays.binarySearch(array, 75);//
		
		int[] array2 = {21,23,43,65,75,88,90};
		System.out.println(findTwo(array2, 99));
		
		int[] array3 = {21,23,43,65,75,88,90};
		System.out.println(findThree(array3, 99));
		
	}
	
	/**
	 * 二分查找法
	 * @param array
	 * @param element
	 * @return
	 */
	public static int findOne(int[] array, int element) {
		int min=0;
		int max = array.length-1;
		while(min<=max) {
			int mid = (max+min)>>1;
			if(element >array[mid]) {
				min = mid+1;
			}else if(element <array[mid]) {
				max = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	/**
	 * 这个二分查找法必须满足的条件：
	 * 	1.数组必须是有顺序的排序，乱序的不能使用二分查找法
	 * @param array
	 * @param key
	 * @return
	 */
	public static int findTwo(int[] array, int key) {
		int max = array.length-1;
		int min = 0;
		while(min<=max) {
			int mid = (max+min) >>1;
			if(key >mid) {
				min = mid+1;
			}else if(key <mid) {
				max = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	/**
	 * 面试题：给定一个有序的数组，如果往该数组中存储一个元素，并保证这个数组还是 有序的，
	 * 那么这个元素在数组中存放的下标如何获取。
	 * @param array
	 * @param key
	 * @return
	 */
	public static int findThree(int[] array, int key) {
		int max = array.length-1;
		int min = 0;
		while(min<=max) {
			int mid = (max+min) >>1;
			if(key >mid) {
				min = mid+1;
			}else if(key <mid) {
				max = mid-1;
			}else {
				return mid;
			}
		}
		//此处返回min是因为当min>max的时候那么就说明这个数是不存在的，
		//那么这个数应该存在的位置就是mid+1所在的位置，也就是min，但是这个有个弊端，
		//如果这个数是最小的数，那么存在的位置就是0，如果作为查找的话，返回0，是不行的，无法判断是否有这个数，
		//但是作为这个面试题的要求是无所谓的。
		return min;
	}
	
}
