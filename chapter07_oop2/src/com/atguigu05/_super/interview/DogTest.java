package com.atguigu05._super.interview;

/**
 * ClassName: DogTest
 * Package: com.atguigu05._super.interview
 * Description:
 *
 * @Author skk
 * @Create 2023/3/21 14:51
 * @Version 1.0
 */
class Creature {
    public Creature() {
        System.out.println("Creature无参数的构造器");
    }
}
class Animal extends Creature {
    public Animal(String name) {
        System.out.println("Animal带一个参数的构造器，该动物的name为" + name);
    }
    public Animal(String name, int age) {
        this(name);
        System.out.println("Animal带两个参数的构造器，其age为" + age);
    }
}
public class DogTest extends Animal {
    public DogTest() {
        super("汪汪队阿奇", 3);
        System.out.println("Dog无参数的构造器");
    }
    public static void main(String[] args) {
        new DogTest();
    }
}

