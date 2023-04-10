package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: InstanceTest
 * Package: com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author skk
 * @Create 2023/3/21 19:24
 * @Version 1.0
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Student());
    }
    public void method(Person e){
        System.out.println(e.getInfo());
//        if(e instanceof Graduate){
//            System.out.println("a graduated student\n" +
//                    "a student\n" +
//                    "a person");
//        }else if(e instanceof Student){
//            System.out.println("a graduated student\n" +
//                    "a student\n");
//        }else{
//            System.out.println("a person");
//        }
        if(e instanceof Graduate){
            System.out.println("a graduated student");
        }
        if(e instanceof Student){
            System.out.println("a student");
        }
        if(e instanceof Person){
            System.out.println("a person");
        }
    }
}
