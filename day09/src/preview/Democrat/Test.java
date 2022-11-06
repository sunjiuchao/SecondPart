package preview.Democrat;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {
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
        Stream<String> actor = list.stream().limit(2).filter(name -> name.length() == 3);
        Stream<String> actor1 = list1.stream().skip(1).limit(4).filter(name -> name.startsWith("李"));
        Stream.concat(actor,actor1).forEach(name-> {
            Actor ac = new Actor(name);
            System.out.println(ac);
        });
    }
}
