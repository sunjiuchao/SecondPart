package com.lession.com;

import java.util.ArrayList;
import java.util.Iterator;

public class ThirdTepyForDemo05 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student stu1 = new Student("张三", 18);
        Student stu2 = new Student("李四", 35);
        Student stu3 = new Student("王五", 60);

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

//        fori普通遍历
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("====================================");
//        iterator迭代器
        Iterator<Student> it = students.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("===================================");
//        Strong For增强for
        for (Student stu : students) {
            System.out.println(stu);
        }
    }

}
