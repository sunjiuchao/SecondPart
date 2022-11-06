package com.Demo01;

public class IntgerTestDemo01 {
    public static void main(String[] args) {
//      调用对象法
//        public Integer(int value)             第一种：已经废除
//        public Integer(atring s)
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("100");

//        public static Integer valueof(int i)  第二种：static访问
//        public static Integer valueof(atring s)
        Integer i3 = Integer.valueOf(2);
        Integer i4 = Integer.valueOf("200");
        System.out.println(i1+"\n"+i2+"\n"+i3+"\n"+i4);

//      java1.5新特性--->自动装箱
//      基本数据类型赋值给引用数据类型时
//      会自动调用valueof方法
        Integer a = 100;
        System.out.println("装箱:"+a);

//      java1.5新特性--->自动拆箱
//      把一个包装类型，变成一个基本数据类型
        Integer a1 = a;
        System.out.println("拆箱"+a1);

        Integer a2 = 100;//自动装箱
        a2 += 200;       //a2拆箱取出100和200相加赋值给a2，a2自动装箱
        System.out.println(a2);

//        细节 null不能进行封箱操作
        Integer a4 = null;
        a4 += 200;
    }
}
