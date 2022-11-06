package com.preview.Date.Tostring;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("张三",18,"男","浙江 杭州");
        Student student1 = new Student("张三",18,"男","浙江 杭州");

//        equals重写之前比较的是地址值
//        equals重写之后比较的是内容
//        在工作中通常对内容进行比较，所以我们可以用equals重写来做内容处理比较

        System.out.println(student.equals(student1));
        System.out.println(student);
        System.out.println(student1);
        int a = 1;
        int b = 1;


//        面试题：解释 equals 和 "==" 的区别
//        在Java中:
//          “==”用于 基本数据类型 比较的是 内容，
//              用于 引用数据类型 比较的是 地址、
//
//          “equals” 只能用于引用数据类型的比较，
//                   equals重写之前比较的是地址值，
//                  equals重写之后比较的是内容



    }
}
