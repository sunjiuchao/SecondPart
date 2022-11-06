package com.preview.ForIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StudentForStrong {
    public static void main(String[] args) {
        Collection<Student> list = new ArrayList<>();
        Student stu = new Student("sunjiuchao", 12);
        Student stu1 = new Student("wuqi", 38);
        Student stu2 = new Student("xvao", 23);
        list.add(stu);
        list.add(stu1);
        list.add(stu2);


//        迭代器遍历
        Iterator<Student> list1 = list.iterator();
        while (list1.hasNext()){
            System.out.println(list1.next());
        }
//       for增强遍历
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
