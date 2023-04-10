package com.atguigu04.example.exer5_objarr1;

/**
 * ClassName: StudentUtil
 * Package: com.atguigu04.example.exer5_objarr1
 * Description:
 *
 * @Author skk
 * @Create 2023/3/3 20:34
 * @Version 1.0
 */
public class StudentUtil {
//    需求一：打印出3年级(state值为3）的学生信息。

    /**
     * 打印指定年级学生信息
     * @param students
     * @param state
     */
    public void printStudentsWithIndex(Student[] students,int state){
        for (int i = 0; i < students.length; i++) {
            if(students[i].state == state){
                students[i].show();
            }
        }
    }

    /**
     * 遍历对象数组
     * @param students
     */
    public void printStudents(Student[] students){
        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }
    }

    /**
     * 冒泡排序 按照得分 需求二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
     * @param students
     */
    public void sortStudents(Student[] students){
        for (int i = 0; i < students.length-1; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
}
