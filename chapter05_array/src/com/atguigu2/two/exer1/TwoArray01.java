package com.atguigu2.two.exer1;

/**
 * ClassName: TwoArray01
 * Package: com.atguigu2.two.exer1
 * Description:
 * 案例1：获取arr数组中所有元素的和。
 *
 * 提示：使用for的嵌套循环即可。
 *
 * @Author skk
 * @Create 2023/2/27 22:23
 * @Version 1.0
 */
public class TwoArray01 {
    public static void main(String[] args) {
        int arr[][] = {{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

            }
            System.out.println("总和为" + sum);

        }
    }
}
