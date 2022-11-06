package com.preview.Date.ApiDemo;

import java.util.Locale;
import java.util.StringJoiner;

public class StringTest {
    public static void main(String[] args) {
//      判断字符串内容是否相同
        String a = "11";
        String b = "11";
        System.out.println(a.equals(b));
//      分割字符串
        String c = "分$割$字$符$串";
        String[] split = c.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
//        字符分割
        String d = "分$割$字$符$串";
        String[] split1 = d.split("\\$");
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }
//      去除首位空格
        String e = " 111 ";
        String trim = e.trim();
        System.out.println(trim);

//      replace替换字符
        String f = "我是$徐 傲";
        String replace = f.replace("$", ":");
        System.out.println(replace);

//      转大小写
        String g = "AbCd";
        String s = g.toLowerCase(Locale.ROOT);
        System.out.println(s);

//      StringBuilder

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            stringBuilder.append(i);
        }

        System.out.println(stringBuilder);

//      StringJoiner格式化字符串
        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        stringJoiner.add("是");
        stringJoiner.add("徐");
        stringJoiner.add("傲");
        System.out.println(stringJoiner);


    }
}
