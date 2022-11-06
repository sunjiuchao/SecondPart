package com.preview.Iterator;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("3");
        collection.add("5");
        collection.add("7");
        java.util.Iterator<String> list = collection.iterator();//迭代器，把指针放入集合起始位置
        while (list.hasNext()){ //hashNext当前指针所指的地址是否有元素
            System.out.println(list.next());//next:取出当前指针所指的元素，并且把指针向后移动一位
        }
    }
}
