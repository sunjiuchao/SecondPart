package com.lession.Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionJavaBook {
    public static void main(String[] args) {
//        “JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，”Java架构师之路”
        Collection<String> list = new ArrayList<>();
        list.add("JavaEE企业级开发指南");
        list.add("Oracle高级编程");
        list.add("MySQL从入门到精通");
        list.add("Java架构师之路");

//使用迭代器遍历所有元素，并打印
//        methodForStrong(list);
//使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
//        System.out.println("=================小于10个字符的如下=============");
//        BoundTen(list);
//使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
//        System.out.println("==============包含java元素的如下==================");
//        ExitJavaMethod(list);
//如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
//        System.out.println("==============删除包含Oracle元素的如下==================");
//        DeleteOracleMethod(list);
//(注意：以上每个功能都单独写个方法，在main方法中逐个调用测试即可)

    }

    private static void DeleteOracleMethod(Collection<String> list) {
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()){
            String next = it2.next();
            if (next.contains("Oracle")){
                it2.remove();
            }
        }
        System.out.println(list);
    }

    private static void ExitJavaMethod(Collection<String> list) {
        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()){
            String next = it1.next();
            if (next.contains("Java")){
                System.out.println(next);
            }
        }
    }

    private static void BoundTen(Collection<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            int length = it.next().length();
            if (length >= 10){
                it.remove();
            }
        }
        System.out.println(list);
    }

    private static void methodForStrong(Collection<String> list) {
        System.out.println("==========所有元素如下==========");
        for (String s : list) {
            System.out.println(s);}
    }
}
