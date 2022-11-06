package com.Demo01;

public class IntgerTestDemo02 {
    public static void main(String[] args) {
//        字符串+任意的数据类型 结果都是字符串
        String a = "100";
        int a1 = 200;
        System.out.println(a + a1);

//        可以将字符串中的整数转换为int类型的整数
        int i = Integer.parseInt(a );
        System.out.println(i+a1);

//        int -->String
        int q = 100;
//        方式一:+""(加引号)
        String s2 = q+"100";
        System.out.println(s2);
//        方式二：可以调用String类中的valueof
        String s = String.valueOf(q);
        System.out.println(s+100);

    }
}
