package com.lession.SetUseDemo01;

import jdk.jfr.SettingDefinition;

import java.util.Iterator;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
//        存取顺序不一致
//        没有索引
//        不能存储重复内容

        /**
         * set:
         * TreeSet HashSet
         */

        TreeSet<String> list = new TreeSet<>();
        list.add("ddd");
        list.add("ccc");
        list.add("ddd");
        list.add("aaa");
        System.out.println(list);

        for (String s : list) {
            System.out.println(s);
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
