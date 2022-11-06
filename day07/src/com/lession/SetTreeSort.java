package com.lession;

import com.lession.TreeSet.Teacher;

import java.util.Comparator;
import java.util.TreeSet;

public class SetTreeSort {
    public static void main(String[] args) {
/*        method_first
            TreeSet<Teacher> t = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
//                o1表示现在存入的元素
//                o2表示已经存的元素
                int result = o1.getAge()-o2.getAge();//主要条件
                result = result == 0?o1.getName().compareTo(o2.getName()):result;//次要条件
                return result;
            }
        });*/

//        method_second第二种方法：内部类的形式指定排序规则
        TreeSet<Teacher> t = new TreeSet<>(
                (Teacher o1, Teacher o2)->{
//                o1表示现在存入的元素
//                o2表示已经存的元素
                    int result = o1.getAge()-o2.getAge();//主要条件
                    result = result == 0?o1.getName().compareTo(o2.getName()):result;//次要条件
                    return result;
                }
        );
        Teacher t1 = new Teacher("sunjiucao",23);
        Teacher t2 = new Teacher("zhaosi",28);
        Teacher t3 = new Teacher("lisi",23);
        t.add(t1);
        t.add(t2);
        t.add(t3);
        System.out.println(t);
    }
}
