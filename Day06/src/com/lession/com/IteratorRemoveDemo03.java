package com.lession.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorRemoveDemo03 {
    public static void main(String[] args) {
        Collection<String> collection  = new ArrayList<>();
        collection.add("123qwe");
        collection.add("123qwer");
        collection.add("123qwert");
        collection.add("123qwerty");
        Iterator<String> it = collection.iterator();
        while (it.hasNext()){
            if ("123qwert".equals(it.next())){
                it.remove();
            }
        }
        System.out.println(collection);
    }
}
