package com.preview.Date;

import com.preview.Date.Tostring.Student;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        //        Objects也需要toString配合的重写，才能输出对象可视化的内容
        Student student = new Student("张三",18,"男","浙江 杭州");
        String s = Objects.toString(student);
        System.out.println(Objects.isNull(student));
        System.out.println(Objects.nonNull(student));
        System.out.println(s);

    }
}
