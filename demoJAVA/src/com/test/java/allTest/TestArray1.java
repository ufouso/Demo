package com.test.java.allTest;

/**
 * 
 * 数组中找最大值
 * @author xpp
 *
 */
public class TestArray1 {
	
	public static void main(String[] args) {
		int[] a = {12,45,2,400,15,117};
		int max = getMax(a);
		System.out.println(max);
		int max2 = getMax_2(a);
		System.out.println(max2);
	}
	
	/**
	 * 定义一个最大值，初始值为第一个元素
	 * @param arr
	 * @return
	 */
	public static int getMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	/**
	 * 定义一个最大值，这个最大值的下标是比较的关键
	 * @param arr
	 * @return
	 */
	public static int getMax_2(int[] arr) {
		int maxIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[maxIndex]) {
				maxIndex = i;
			}
		}
		return arr[maxIndex];
		
	}
}
