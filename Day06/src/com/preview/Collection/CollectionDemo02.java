package com.preview.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo02 {
    public static void main(String[] args) {
//        boolean add(E e)添加元素
        Collection<String> collection = new ArrayList<>();
        collection.add("qqq");
        collection.add("www");
        collection.add("eee");
        collection.add("dddd");
        collection.add("ddddffff");
//        System.out.println(collection);
//        boolean remove(Object o)从集合中移除指定的元素 成功返回true 失败返回flase
//        method(collection);
//        boolean removeIf(Object o)根据条件进行移除
//        method1(collection);
//        void   clear()清空集合中的元素
//        method2(collection);
//        boolean contains(Object o)判断集合中是否存在指定的元素
//        nethod3(collection);
//        boolean isEmpty()判断集合是否为空
//        methodIsEmpty(collection);
//        int   size()集合的长度，也就是集合中元素的个数
//        sizeOfCollection(collection);
    }

    private static void sizeOfCollection(Collection<String> collection) {
        int size = collection.size();
        System.out.println(size);
    }

    private static void methodIsEmpty(Collection<String> collection) {
        boolean empty = collection.isEmpty();
        System.out.println(empty);
    }

    private static void nethod3(Collection<String> collection) {
        boolean result = collection.contains("dddd");
        System.out.println(result);
    }

    private static void method2(Collection<String> collection) {
        collection.clear();
        System.out.println(collection);
    }

    private static void method1(Collection<String> collection) {
        collection.removeIf(
                (String s)->{
                    return  s.length()==4;
                }
        );
        System.out.println(collection);
    }

    private static void method(Collection<String> collection) {
        boolean result1 = collection.remove("qqq");
        boolean result2 = collection.remove("ddd");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(collection);
    }
}
