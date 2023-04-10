package com.atguigu4.search_sort.exer2;

/**
 * ClassName: ArrayExer02
 * Package: com.atguigu4.search_sort.exer2
 * Description:
 *案例1：线性查找
 *
 * 定义数组：int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 * 查找元素5是否在上述数组中出现过？如果出现，输出对应的索引值。
 *
 *
 * 案例2：二分法查找
 *
 * 定义数组：int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
 * 查找元素5是否在上述数组中出现过？如果出现，输出对应的索引值。
 * @Author skk
 * @Create 2023/2/28 14:53
 * @Version 1.0
 */
public class ArrayExer02liner {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};
//        int target = 5;
        int target = 15;
        boolean isFlag = true;
        for (int i = 0; i < arr1.length; i++) {
            if (target == arr1[i]){
                System.out.println("找到了" + target +",对应位置为：" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag){
            System.out.println("未找到此元素");
        }
    }
}
