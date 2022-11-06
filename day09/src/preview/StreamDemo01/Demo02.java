package preview.StreamDemo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo02 {
    public static void main(String[] args) {
//              stream流的应用场景

// 单列集合
//   使用Collection接口中的默认方法stream生成流
//   default Stream<E> stream()
//   ArrayMethod();
//
// 双列集合
//   间接的生成流
//   通过keySet或者entrySet获取一个Set集合，再获取Stream流
//      MapMethod();
//
// 数组
//   Arrays中的静态方法Stream生成流
//        arraysMethod();
//
//
//      同种数据类型的多个数据
//        manyMethod();
//        单独获取键值
//        valuesMethod();

//        找性张
//        method();
//        去重复distinct
        DistincMethod();

    }

    private static void DistincMethod() {
        ArrayList<String> list = new ArrayList<>();
        list.add("张浩");
        list.add("唐三");
        list.add("张飞");
        list.add("小奥");
        list.add("张飞");
        list.add("小舞");

        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
//        long count = list.stream().count();
//        System.out.println(count);

//        Stream<String> skip = list.stream().skip(2);
//        Stream<String> limit = list.stream().limit(2);
//        Stream.concat(skip,limit).forEach(s-> System.out.println(s));
//        Stream.concat(skip,limit).distinct().forEach(s-> System.out.println(s));
    }

    private static void method() {
        ArrayList<String> list = new ArrayList<>(List.of("张浩","唐三","张飞","小奥","小舞"));
//        list.add("张浩");
//        list.add("唐三");
//        list.add("张飞");
//        list.add("小奥");
//        list.add("小舞");
        list.stream().filter(s->s.startsWith("张")).forEach(s->System.out.println(s));
    }

    private static void valuesMethod() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zhangsdan",23);
        map.put("lisi",24);
        map.put("wangwu",25);
        map.put("yunlong",26);
        map.put("anglebybe",27);
        Stream<String> stream = map.keySet().stream();
        Stream<Integer> stream1 = map.values().stream();
        stream.forEach(s-> System.out.println(s));
        stream1.forEach(s-> System.out.println(s));
    }

    private static void manyMethod() {
        Stream.of("1",2,"3",4,"5",6).forEach(s-> System.out.println(s));
    }

    private static void arraysMethod() {
        int arr[] = {1,3,5,6,7,8};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }

    private static void MapMethod() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zhangsdan",23);
        map.put("lisi",24);
        map.put("wangwu",25);
        map.put("yunlong",26);
        map.put("anglebybe",27);
//      双列集合不能直接用获取Stream流
//      keyaSet获取键
        map.keySet().stream().forEach(s-> System.out.println(s));
//      entrySet
//      先获取到所有的键值对对象
//      再把Set集合放到Stream流中
        map.entrySet().stream().forEach(s-> System.out.println(s));
        map.entrySet().stream().forEach(s-> System.out.println(s.getKey()+"-->"+s.getValue()));
    }


    private static void ArrayMethod() {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("131");
        list.add("121");
        Stream<String> stream = list.stream();
        stream.forEach(s-> System.out.println(s));
        System.out.println("============================");
        list.stream().forEach(s-> System.out.println(s));
    }
}
