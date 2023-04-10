package com.atguigu3.common_algorithm.exer1;

/**
 * ClassName: ArrayExer01
 * Package: com.atguigu3.common_algorithm.exer1
 * Description:
 *
 * @Author skk
 * @Create 2023/2/28 9:45
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        //1.创建数组 动态初始化
        int arr[] = new int[10];
        //2.循环赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(99-10+1)) +10;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值：" + max);
        //最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("最小值：" + max);
        //和
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("和为：" + sum);
        //平均值
        float avg = sum/arr.length;
        System.out.println("平均值：" + avg);
    }
}
