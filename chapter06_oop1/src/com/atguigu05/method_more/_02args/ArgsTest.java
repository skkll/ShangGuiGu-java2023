package com.atguigu05.method_more._02args;

/**
 * @author 尚硅谷-宋红康
 * @create 23:23
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest test = new ArgsTest();
        test.print();
        test.print(1);
        test.print(1,2);
        test.print(new int[]{1,2,3});
        test.print(1,2,3);

    }
    public void print(int ... nums){
        for (int j = 0; j <nums.length ; j++) {
            System.out.println(nums[j]);
        }
    }
//    与上一个是相同的
//    public void print(int[] nums){
//
//    }
//    正确 可变参数要放在后面
    public void print(double i,int ... nums){
    }
//    错误
//    public void print(int ... nums,int i){
//    }
    public void print(int i){
        System.out.println("111");
    }
    public void print(int i,int j){
        System.out.println("111");
    }

}
