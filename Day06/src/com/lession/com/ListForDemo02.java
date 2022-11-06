package com.lession.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListForDemo02 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("qwe");
        list.add("asd");
        list.add("zxc");
        list.add("sdf");
        list.add("cvc");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
