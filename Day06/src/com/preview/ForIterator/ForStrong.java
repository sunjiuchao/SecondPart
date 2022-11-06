package com.preview.ForIterator;

import java.util.ArrayList;
import java.util.Collection;

public class ForStrong {
    public static void main(String[] args) {
        String arr[] = {"q","w","re","qwr","wer"};
        for (String s : arr) {
            System.out.println(s);
        }

        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("321sdaf");
        collection.add("45746hgd");
        collection.add("twst6");
        for (String s : collection) {
            System.out.println(s);
        }
    }
}
