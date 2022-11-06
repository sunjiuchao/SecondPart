package preview.StreamDemo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamFinish {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三风");
        list.add("薛二用");
        list.add("李华多");
//        内部类写法
//        list.stream().forEach(
//                new Consumer<String>() {
//                    @Override
//                    public void accept(String s) {
//                        System.out.println(s);
//                    }
//                }
//        );

//        简写
//        list.stream().forEach(s-> System.out.println(s));

//        统计数量
//        long count = list.stream().count();
//        System.out.println(count);

//        集合通过流处理只是展示复合条件的数据，对集合没有改变，
//        Collector.tolist方法可以获取这些筛选数据，并存入到list集合中
        ArrayList<Integer> relist = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            relist.add(i);
        }
        relist.add(10);
        relist.add(10);
        relist.add(10);
        List<Integer> resultlist = relist.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(resultlist);

        //Collectors.toSet()可以除去集合中的重复元素
        Set<Integer> resultlist1 = relist.stream().filter(num -> num % 2 == 0).collect(Collectors.toSet());
        System.out.println(resultlist1);
    }
}
