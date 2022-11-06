package preview.StreamDemo01;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三风");
        list.add("赵蕾");
        list.add("李华多");
        list.add("王页里");
        list.add("张用");
        list.add("薛二用");
        list.add("王二小");

//        list.stream().filter(
//                s -> s.startsWith("王")
//        ).filter(
//                s->s.length()==3
//        ).forEach(
//                s-> System.out.println(s)
//        );

//        匿名内部类的方法过滤
        list.stream().filter(
                new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        boolean result = s.startsWith("张");
                        return result;
                    }
                }
        ).forEach(s-> System.out.println(s));

//        Predicate简写
        list.stream().filter(
                (String s)->{
                    boolean re = s.startsWith("张");
                    return re;
                }
        ).forEach(s-> System.out.println(s));

        list.stream().filter(s-> s.startsWith("张")).forEach(s-> System.out.println(s));
    }
}
