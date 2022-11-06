package com.lession.org;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("sun");
        list.add("jiu");
        list.add("chao");

//        首位加元素
        list.addFirst("love");
        list.addLast("boy");

//        首位删除元素
        list.removeFirst();
        list.removeLast();

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
    }
}
