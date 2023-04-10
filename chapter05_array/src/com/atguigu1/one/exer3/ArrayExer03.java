package com.atguigu1.one.exer3;

import java.util.Scanner;

/**
 * ClassName: ArrayExer03
 * Package: com.atguigu1.one.exer3
 * Description:
 * 案例：学生考试等级划分
 *
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 	成绩>=最高分-10    等级为’A’
 * 	成绩>=最高分-20    等级为’B’
 * 	成绩>=最高分-30    等级为’C’
 * 	其余              等级为’D’
 *
 * 提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 *
 * @Author skk
 * @Create 2023/2/27 20:31
 * @Version 1.0
 */
public class ArrayExer03 {
    public static void main(String[] args) {
        //1. 从键盘获得学生人数，根据学生人数创建数组
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int count = scan.nextInt();
        float[] scores = new float[count];
        //2.根据输入的成绩 存入数组
        System.out.println("请输入"+ count + "个成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextFloat();
        }
        //3.获取学生成绩最大值
        float maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (maxScore < scores[i]){
                maxScore = scores[i];
            }
        }
        System.out.println("最高成绩是" + maxScore);
        //4.遍历数组元素，根据成绩和最高分的差值得到每个学生的等级 并输出成绩和等级
        char grade;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>=maxScore-10){
                grade = 'A';
            } else if (scores[i]>=maxScore-20){
                grade = 'B';
            } else if (scores[i]>=maxScore-30){
                grade = 'C';
            } else {
                grade = 'D';
            }
        System.out.println("student" + i + " score is " + scores[i] + " grade is " + grade);
        }
    scan.close();

    }
}
