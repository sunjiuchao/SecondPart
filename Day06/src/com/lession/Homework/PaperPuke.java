package com.lession.Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PaperPuke {
    public static void main(String[] args) {

        //创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        List<String> broker = new ArrayList<>();

        /*往牌盒里装牌
         * ♦♣♥♠
         * */
        //定义花色数组
        String[] colors = {"♦" , "♣" , "♥" , "♠" };

        //定义点数数组
        String[] numbers = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K" , "A"};

        //拼接让每个花色都有13张从2-A的牌
        for (String color : colors) {
            for (String number : numbers) {
                broker.add(color+number);
            }
        }

        //加入大小王
        broker.add("小王");
        broker.add("大王");

        // 洗牌，打乱集合中的元素
        Collections.shuffle(broker);

//        System.out.println(broker);
        // 补全代码

        ArrayList<String> persion1 = new ArrayList<>();
        ArrayList<String> persion2 = new ArrayList<>();
        ArrayList<String> persion3 = new ArrayList<>();
        ArrayList<String> floor = new ArrayList<>();
        for (int i = 0; i < broker.size(); i++) {
            String s = broker.get(i);//开始发牌，遍历每一张
            if (i >= broker.size()-3) {//底牌
                floor.add(s);
            } else if (i % 3 == 2) {//第一个开始发牌（2，5，8，11）
                persion2.add(s);
            } else if (i % 3 == 0) {//第三个开始发牌（3，6，9，12）
                persion3.add(s);
            } else if (i % 3 == 1){//第一个开始发牌（1，4，7，10）
                 persion1.add(s);

            }
        }

        System.out.print("一号的牌是");
        for (String poker : persion1) {
            System.out.print(poker + " ");
        }

        System.out.println();
        System.out.print("二号的牌是");
        for (String poker : persion2) {
            System.out.print(poker + " ");
        }

        System.out.println();
        System.out.print("三号的牌是");
        for (String poker : persion3) {
            System.out.print(poker + " ");
        }

        System.out.println();

        System.out.print("底牌是");
        for (String poker : floor) {
            System.out.print(poker + " ");
        }





    }
}
