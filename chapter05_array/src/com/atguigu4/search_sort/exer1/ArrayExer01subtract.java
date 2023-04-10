package com.atguigu4.search_sort.exer1;

/**
 * ClassName: ArrayExer01subtract
 * Package: com.atguigu4.search_sort.exer1
 * Description:
 *案例：数组的缩容：
 * 现有数组 案例：数组的缩容：
 * 现有数组 int[] arr={1,2,3,4,5,6,7}。现需删除数组中索引为4的元素。
 * 将后续的数挪到前面
 * @Author skk
 * @Create 2023/2/28 14:41
 * @Version 1.0
 */
public class ArrayExer01subtract {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int deleteIndex = 4;
        for (int i = deleteIndex; i <arr.length-1 ; i++) {
            arr[i] = arr[i + 1];
        }
        //最后一个设置为0
        arr[arr.length - 1] = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
