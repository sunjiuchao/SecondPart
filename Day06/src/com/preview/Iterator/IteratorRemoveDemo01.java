package com.preview.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorRemoveDemo01 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("5");
        collection.add("5");
        collection.add("7");
        method(collection);
        System.out.println(collection);
    }

    private static void method(Collection<String> collection) {
        Iterator<String> list = collection.iterator();
        while (list.hasNext()){
            if ("5".equals(list.next())){
                list.remove();
            }
        }
    }
}
