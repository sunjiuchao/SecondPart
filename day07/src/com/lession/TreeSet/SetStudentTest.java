package com.lession.TreeSet;

import java.util.TreeSet;

public class SetStudentTest {
    public static void main(String[] args) {
        /**
         * 1:不包含重复元素的集合
         * 2：没有带索引的方法
         * 3：可以将元素按照规则进行排序
         * 使用TreeSet需要定制排序规则
         */

        TreeSet<Student> stu = new TreeSet<>();
        Student stu1 = new Student("张三", 19);
        Student stu2 = new Student("李四", 32);
        Student stu3 = new Student("王五", 30);
        Student stu4 = new Student("张三", 18);

        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
        stu.add(stu4);

        System.out.println(stu);
    }
}
