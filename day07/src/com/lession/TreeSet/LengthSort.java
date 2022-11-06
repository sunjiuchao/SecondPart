package com.lession.TreeSet;

import java.util.TreeSet;

public class LengthSort {
    public static void main(String[] args) {

        TreeSet<Teacher> t = new TreeSet<>(
                (o1,o2)->{
                    //重要条件
                    int result = o1.getAge()-o2.getAge();
                    if (result == 0){//根据长度排序
                        return o1.getName().length()-o2.getName().length();
                    }else {
                        return result;
                    }
                    //次要条件
        });

        Teacher p1 = new Teacher("sunjiuchao", 32);
        Teacher p2 = new Teacher("dasab", 32);
        Teacher p3 = new Teacher("wangwu", 11);
        Teacher p4 = new Teacher("wuyifan", 32);
        Teacher p5 = new Teacher("lishiasdasd", 32);
        Teacher p6 = new Teacher("iasdasd", 32);
        Teacher p7 = new Teacher("lishsdasd", 32);

        t.add(p1);
        t.add(p2);
        t.add(p3);
        t.add(p4);
        t.add(p5);
        t.add(p6);
        t.add(p7);

        for (Teacher teacher : t) {
            System.out.println(teacher);
        }
    }
}
