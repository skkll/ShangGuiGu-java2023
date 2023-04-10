package com.atguigu1.one.exer2;

import java.util.Scanner;

/**
 * ClassName: ArrayExer02
 * Package: com.atguigu1.one.exer2
 * Description: 案例
 *输出英文星期几
 *
 * 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 * {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 *
 * 拓展：一年12个月的存储
 *
 * 用一个数组，保存12个月的英语单词，从键盘输入1-12，显示对应的单词。
 * {"January","February","March","April","May","June","July","August","September","October","November","December"}
 * @Author skk
 * @Create 2023/2/27 20:22
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        String[] week = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数值");
        int a = scan.nextInt();
        if (a < 1|| a > 7){
            System.out.println("你输入有误");
        }else {
            System.out.println(week[a-1]);
        }
        scan.close();

    }

}
