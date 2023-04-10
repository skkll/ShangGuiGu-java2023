package com.atguigu5.arrays;

import java.util.Arrays;

/**
 * 
 * 测试数组的工具类：Arrays的使用 （了解）
 *
 * @author 尚硅谷-宋红康
 * @create 13:20
 */
public class ArraysTest {
	public static void main(String[] args) {
		//1. boolean equals(int[] a,int[] b)：比较两个数组的元素是否依次相等
		int arr1[] ={1,2,3,4,5};
		int arr2[] ={1,2,3,4,5};
		System.out.println(arr1 == arr2);

		boolean isFlag = Arrays.equals(arr1,arr2);
		System.out.println(isFlag);
		//2. String toString(int[] a):输出数组元素信息。
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));

		//3.void fill(int[] a,int val):将指定值填充到数组之中。
		Arrays.fill(arr1,10);
		System.out.println(Arrays.toString(arr1));

		//4. void sort(int[] a):使用快速排序算法实现的排序
		int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 6, 24, 67};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		//5. int binarySearch(int[] a,int key):二分查找
		//使用前提：当前数组必须是有序的
		int index = Arrays.binarySearch(arr,88);
		if (index>0) {
			System.out.println(index);
		}else {
			System.out.println("未找到");
		}

	}
}
