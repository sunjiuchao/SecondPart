package com.lession.com;

import java.util.ArrayList;
import java.util.Collection;

public class ListDome01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("11");
        list.add("qwe");
        list.add("aqq");
        list.add("qwe");
        list.add("bool");
        list.add("asdf");
        list.add("bfgd");
        list.add("itheima");
//        String代表集合的泛型，s为集合中的每一个元素
//        移除长度为3的s
        list.removeIf(s -> s.length() == 3);

//        移除s中起始位置元素为“a”的s
//        list.removeIf(s->s.startsWith("a"));

//        移除s中含有元素为“a”的s
//        list.removeIf(s->s.contains("l"));

        System.out.println(list);

    }
}
