package com.atguigu3.common_algorithm.exer5;

/**
 * ClassName: ArrayExer05
 * Package: com.atguigu3.common_algorithm.exer5
 * Description:
 *案例：
 * 定义数组：int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 * 如何实现数组元素的反转存储？你有几种方法。
 * @Author skk
 * @Create 2023/2/28 11:12
 * @Version 1.0
 */
public class ArrayExer05 {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//        }
        //方式2：
        for(int i = 0,j = arr.length - 1;i < j;i++,j--){
            //交互arr[i] 与 arr[j]位置的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
