package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Person
 * Package: com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author skk
 * @Create 2023/3/21 19:21
 * @Version 1.0
 */
public class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
