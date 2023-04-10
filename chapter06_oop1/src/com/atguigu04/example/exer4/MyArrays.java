package com.atguigu04.example.exer4;

/**
 * ClassName: Myarrays
 * Package: com.atguigu04.example.exer4
 * Description:
 *根据上一章数组中的常用算法操作，自定义一个操作int[]的工具类。
 * 涉及到的方法有：求最大值、最小值、总和、平均数、遍历数组、复制数组、
 *              数组反转、数组排序(默认从小到大排序)、查找等
 * @Author skk
 * @Create 2023/3/3 9:33
 * @Version 1.0
 */
public class MyArrays {
    /**
     * 获取Int[]的最大值
     *
     * @param arr 要获取最大值的数组
     * @return 数组的最大值
     */
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取int[]数组的最小值
     *
     * @param arr 要获取最小值的数组
     * @return 数组的最小值
     */
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public double getAver(int[] arr) {

        return getSum(arr) / arr.length;
    }

    public void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print("," + arr[i]);
            }
        }
        System.out.println("]");
    }

    public int[] getCopy(int[] arr) {
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }

    public void revers(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public int binry(int[] arr, int target) {
        sort(arr);
        int head = 0;
        int end = arr.length - 1;
        while (head < end) {
            int middle = (head + end) / 2;
            if (target == arr[middle]) {
                return middle;
            }else if (target>arr[middle]){
                head = middle+1;
            }else {
                end = middle-1;
            }
        }
        return -1;
    }
}