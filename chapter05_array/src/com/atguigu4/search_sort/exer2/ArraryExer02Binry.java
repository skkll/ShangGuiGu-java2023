package com.atguigu4.search_sort.exer2;

/**
 * ClassName: ArraryExer02Binry
 * Package: com.atguigu4.search_sort.exer2
 * Description:
 *案例2：二分法查找
 *
 * 定义数组：int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
 * 查找元素5是否在上述数组中出现过？如果出现，输出对应的索引值。
 * @Author skk
 * @Create 2023/2/28 15:08
 * @Version 1.0
 */
public class ArraryExer02Binry {
    public static void main(String[] args) {
        int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
        int target = 99;
        int head = 0; //默认首、尾索引
        int end = arr2.length-1;
        boolean isFlag = false;
        while (head<=end){
            int middle = (head +end)/2;
            if (target == arr2[middle]){
                System.out.println("找到了" + target +",对应的位置为：" + middle);
                isFlag = true;
                break;
            }else if(target > arr2[middle]){
                head = middle+1;
            }else {
                end = middle -1;
            }
        }
        if (!isFlag){
            System.out.println("未找到");
        }

    }
}
