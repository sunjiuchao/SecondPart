package com.preview.Demo05;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("输入书名：");
            String s = sc.next();
            System.out.println("价格：");
            int v = sc.nextInt();
            Book book = new Book(s,v);
            books.add(book);
            System.out.println("添加成功，继续按1，结束按任意数字。");
            int i = sc.nextInt();
            if (i==1){
                continue;
            }else {
                break;
            }

        }
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
