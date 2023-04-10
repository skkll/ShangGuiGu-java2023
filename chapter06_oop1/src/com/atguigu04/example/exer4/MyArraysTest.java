package com.atguigu04.example.exer4;

/**
 * ClassName: MyArraysTest
 * Package: com.atguigu04.example.exer4
 * Description:
 *
 * @Author skk
 * @Create 2023/3/3 15:23
 * @Version 1.0
 */
public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = new int[]{5,7,8,2,4,9,32,45,25,8,13,11};
        MyArrays ma = new MyArrays();
        ma.print(arr);
        System.out.println(ma.getMax(arr));
        System.out.println(ma.getMin(arr));
        System.out.println(ma.getSum(arr));
        System.out.println(ma.getAver(arr));
        ma.revers(arr);
        ma.print(arr);
        ma.sort(arr);
        ma.print(arr);
        System.out.println(ma.binry(arr, 99));
    }
}
