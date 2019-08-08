
package com.hjbz.test.learning.sort;

import java.util.Random;

public class BubblingSort {


	public static void main(String[] args) {

		int[] arr = new int[10];

		Random r = new Random();
		for (int i = 0; i < 10; i++){
			arr[i] = r.nextInt(100);
		}
		System.out.println("排序之前：");
		printArray(arr);
		System.out.println("排序之后：");
		int[] a = sortArray(arr);
		printArray(a);
	}


	/**
	 * 输出数组-->按格式
	 * @param arr
	 */
	private static void printArray(int[] arr){
		for (int i= 0; i<arr.length;i++){
			if (i == arr.length-1){
				System.out.println(arr[i]);
				break;
			}
			System.out.print(arr[i]+",");
		}
	}

	/**
	 * 冒泡排序
	 * @param arr
	 * @return
	 */
	public static int[] sortArray(int[] arr){
		for (int i=0;i<arr.length;i++){
			for (int j=0;j<arr.length-1-i;j++){
				if (arr[j] > arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					continue;
				}
			}
		}
		return arr;
	}




}
