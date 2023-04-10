package com.atguigu05.method_more._01overload.exer;

/**
 * ClassName: OverLoadExer
 * Package: com.atguigu05.method_more._01overload.exer
 * Description:
 *
 * @Author skk
 * @Create 2023/3/3 21:15
 * @Version 1.0
 */
public class OverLoadExer {
    public void max(int num){
        System.out.println(num * num);
    }
    public void max(int i,int j){
        System.out.println(i * j);
    }
    public void max(String num){
        System.out.println(num);
    }
    public double max(double i,double j){
        return (i>=j)?i:j;
    }
    public double max(double i,double j,double k){
        return (max(i,j)>=k)?max(i,j):k;
    }
}
