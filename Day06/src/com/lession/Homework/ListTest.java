package com.lession.Homework;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        String s1 = "郭靖";
        String s2 = "黄蓉";
        String s3 = "黄药师";
        String s4 = "老顽童";
        String s5 = "瑛姑";

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        List<String> list1 = new ArrayList<>();
        list1.add("芥末");
        list1.add("学狗叫5声");
        list1.add("10个俯卧撑");
        list1.add("喝啤酒");
        list1.add("蛙跳10个");

        for (String name : list) {
            Random random = new Random() ;
            int index  = random.nextInt(list1.size());
            String content = list1.remove(index);
            // 输出结果
            System.out.println(name + "抓到的阄为: " + content);
        }
    }
}
