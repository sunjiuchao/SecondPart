package com.lession.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class UseDemo01 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("@");
        ts.add("111");
        ts.add("esd");
        ts.add("2");
        ts.add("567");
        ts.add("fg");
        System.out.println(ts);
        System.out.println("====================");
        Iterator<String> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
