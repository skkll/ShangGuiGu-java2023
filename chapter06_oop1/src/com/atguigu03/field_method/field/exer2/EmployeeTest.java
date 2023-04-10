package com.atguigu03.field_method.field.exer2;

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
        emp1.name = "lili";
        emp1.wage = 9999;
        emp1.birthday = new Mydate();
        emp1.birthday.day = 15;
        emp1.birthday.month = 1;
        emp1.birthday.year = 1998;

        System.out.println("id = "+ emp1.id +",name = " + emp1.name
                + ",birthday = " + emp1.birthday.year + "年" +emp1.birthday.month +
                "月" +emp1.birthday.day + "日");

    }
}
