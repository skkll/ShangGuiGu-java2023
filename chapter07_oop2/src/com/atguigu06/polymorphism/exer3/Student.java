package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Student
 * Package: com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author skk
 * @Create 2023/3/21 19:22
 * @Version 1.0
 */
public class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
