package com.atguigu1.one;

/**
 * 一维数组的基本使用
 *
 * @author 尚硅谷-宋红康
 * @create 12:08
 */
public class OneArrayTest {
	
	public static void main(String args[]) {
		//1. 数组的声明与初始化
		//声明数组
		double[] prices;
		//数组的初始化  静态初始化  数组变量的赋值和数组元素的幅值同时进行
		prices = new double[]{20.23,53.66,45.25};
//		String[] foods;
//		foods = new String[]{};
		//动态初始化  数组变量的赋值和数组元素的赋值同时进行
		String[] foods = new String[4];
		//其他正确的方式
		int[] arr2 =new int[4];
		int arr[] = {1,2,3,4};//类型推断

		//2. 数组元素的调用
		System.out.println(arr[0]);
		foods[0] = "猫";
		foods[1] = "狗";

		//3. 数组的长度 用来表述数组容器中容量的大小
		//使用length属性
		System.out.println(foods.length);
		System.out.println(prices.length);

		//4. 如何遍历数组
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
