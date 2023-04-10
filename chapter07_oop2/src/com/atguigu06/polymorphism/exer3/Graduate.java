package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Graduate
 * Package: com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author skk
 * @Create 2023/3/21 19:23
 * @Version 1.0
 */
public class Graduate extends Student {
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}
