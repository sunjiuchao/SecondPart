package lession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张浩");
        list.add("唐三");
        list.add("张飞");
        list.add("小奥");
        list.add("张飞");
        list.add("小舞");
//        List收集全部元素
        List<String> list1 = list.stream().skip(2).limit(3).collect(Collectors.toList());
        list1.forEach(s-> System.out.println(s));
//        Set收集全部元素，并且去除重复的数据==》（可以用 distinc.collectors.toList() 去除重复）
//        Set<String> list2 = list.stream().skip(2).limit(3).collect(Collectors.toSet());
//        list2.forEach(s-> System.out.println(s));
    }
}
