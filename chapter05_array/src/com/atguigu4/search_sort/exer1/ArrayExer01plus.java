package com.atguigu4.search_sort.exer1;

/**
 * ClassName: ArrayExer01plus
 * Package: com.atguigu4.search_sort.exer1
 * Description:
 *案例1：数组的扩容:
 *
 * 现有数组 int[] arr = new int[]{1,2,3,4,5};
 * 现将数组长度扩容1倍，并将10,20,30三个数据添加到arr数组中，如何操作？
 * @Author skk
 * @Create 2023/2/28 14:27
 * @Version 1.0
 */
public class ArrayExer01plus {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] Newarr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            Newarr[i] = arr[i];
        }
        Newarr[arr.length] = 10;
        Newarr[arr.length+1] = 20;
        Newarr[arr.length+2] = 30;
        arr = Newarr;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
