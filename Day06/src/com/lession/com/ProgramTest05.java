package com.lession.com;

import java.util.ArrayList;

public class ProgramTest05 {
    public static void main(String[] args) {
        /*找出集合中所有姓张的人并且年龄大于18岁的并全部返回*/
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三", 22);
        Student stu2 = new Student("李四", 26);
        Student stu3 = new Student("张翠山", 38);
        Student stu4 = new Student("赵六", 19);
        Student stu5 = new Student("张三风", 103);
        Student stu6 = new Student("张无忌", 17);
        Student stu7 = new Student("赵敏", 16);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        list.add(stu6);
        list.add(stu7);
        for (Student st : list) {
            if(st.getAge()>18 && st.getName().contains("张")){
                System.out.println(st);
            }
        }
    }
}
