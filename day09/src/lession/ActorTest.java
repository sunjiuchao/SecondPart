package lession;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ActorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张国荣");
        list.add("李荣");
        list.add("马自达");
        list.add("徐峥");
        list.add("张强");
        list.add("李诞");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("李爽在");
        list1.add("李学庆");
        list1.add("白鹿");
        list1.add("郑爽");
        list1.add("李松润");
        list1.add("丽莎");
        Stream<String> man = list.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> woman = list1.stream().filter(s -> s.startsWith("林")).skip(1);
        Stream.concat(man,woman).forEach(
                name->{
//                    Actor actor = new Actor(name);
                    System.out.println(new Actor(name));
                }
        );
    }
}
