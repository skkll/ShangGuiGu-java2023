package com.atguigu04.example.exer5_objarr1;

/**
 * ClassName: Student
 * Package: com.atguigu04.example.exer5_objarr
 * Description:
 *1）定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 * 年级[1,6] : (int)(Math.random() * 6 + 1)
 * 分数[0,100] : (int)(Math.random() * 101)
 * @Author skk
 * @Create 2023/3/3 15:38
 * @Version 1.0
 */
public class Student {
    int number;  //学号
    int state;   //年级
    int score;   //分数
    public void show(){
        System.out.println("number : " + number + ",state : " +
        state + ", score : " + score);
    }
}
