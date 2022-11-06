package com.lession.com;

import java.util.ArrayList;
import java.util.Collection;

public class ForStrongDemo04 {
    public static void main(String[] args) {
        Collection<String> collection  = new ArrayList<>();
        collection.add("123qwe");
        collection.add("123qwer");
        collection.add("123qwert");
        collection.add("123qwerty");

        for (String str : collection) {
            System.out.println(str);
        }
    }
}
