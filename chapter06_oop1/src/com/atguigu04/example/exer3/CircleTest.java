package com.atguigu04.example.exer3;

/**
 * ClassName: CircleTest
 * Package: com.atguigu04.example.exer3
 * Description:
 *利用面向对象的编程方法，设计类Circle计算圆的面积。
 * @Author skk
 * @Create 2023/3/3 9:27
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle A1 = new Circle();
        A1.r = 1.5;
        double A = A1.area();
        System.out.println(A);
    }
}
