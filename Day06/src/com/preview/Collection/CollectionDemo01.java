package com.preview.Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDemo01 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        String arr2[] = {"a","b","c"};

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr2));

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
    }
}
