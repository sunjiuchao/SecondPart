package preview.demo02;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add("张三风");
        list.add("薛二用");
        list.add("李华多");
        list2.add("薛二用");
        list2.add("张用");
        list2.add("薛二用");
        list2.add("王二小");
//        跳过指定参数的数据skip
//        list2.stream().skip(2).forEach(s-> System.out.println(s));
//        截取指定参数的数据skip
        list2.stream().limit(3).forEach(s-> System.out.println(s));
//        数据流连接
//        Stream<String> stream = list.stream();
//        Stream<String> stream1 = list2.stream();
//        Stream.concat(stream,stream1).forEach(s-> System.out.println(s));

//        数据流去重复
//        list2.stream().distinct().forEach(s-> System.out.println(s));
    }
}
