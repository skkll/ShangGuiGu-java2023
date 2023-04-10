package com.atguigu4.search_sort.exer3;

/**
 * ClassName: BubbleSortTest
 * Package: com.atguigu4.search_sort.exer3
 * Description:
 * 案例1：使用冒泡排序，实现整型数组元素的排序操作
 * 比如：int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 *
 * @Author skk
 * @Create 2023/2/28 16:41
 * @Version 1.0
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 6, 24, 67};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//            优化，不用和最后的相比
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }


    }

}
