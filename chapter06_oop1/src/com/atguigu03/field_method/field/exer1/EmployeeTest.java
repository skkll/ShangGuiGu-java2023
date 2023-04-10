package com.atguigu03.field_method.field.exer1;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu03.field_method.field.exer1
 * Description:
 *
 * @Author skk
 * @Create 2023/3/1 11:26
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1);
        emp1.id = 5;
        System.out.println("id = "+ emp1.id +",name = " + emp1.name);

        Employee emp2 = new Employee();
    }
}
