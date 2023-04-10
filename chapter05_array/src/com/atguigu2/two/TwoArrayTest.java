package com.atguigu2.two;

/**
 * 二维数组的基本使用（难点）
 *
 * @author 尚硅谷-宋红康
 * @create 13:08
 */
public class TwoArrayTest {
	public static void main(String[] args) {
		//1. 数组的声明与初始化
		//方式1：静态初始化
		int[][] arr1 = new int[][]{{1,2,3},{3,6}};
		//方式2：动态
		String[][] arr2 = new String[3][4];
		double[][] arr3 = new double[2][];

		//2. 数组元素的调用
		//针对于arr1来说，外层元素{1,2,3}、{3,6} 内层元素：1,2,3,3,6
		//调用内层元素
		System.out.println(arr1[0][0]);//1
		System.out.println(arr1[1][1]);//6

		//调用外层元素
		System.out.println(arr2[0]);//[I@776ec8df
		//测试arr3,arr4
		arr2[0][1] = "Tom";
		System.out.println(arr2[0][1]);
		System.out.println(arr2[0]);//[Ljava.lang.String;@4eec7777

		arr3[0] = new double[4];
		arr3[0][0] = 1.0;

		//3. 数组的长度
		System.out.println(arr1.length);//2
		System.out.println(arr1[0].length);//3
		System.out.println(arr1[1].length);//

		//4. 如何遍历数组
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}


	}
}
