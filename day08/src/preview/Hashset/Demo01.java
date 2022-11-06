package preview.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
//        哈希值：“是JDK根据对象的地址或者属性，算出来的int类型的整数
//        通过Object类中的方法获取对象的哈希值
//        hashCode();
//   First
        HashSet<Student> s = new HashSet<>();
//    没有重写哈希值：哈希值是根据对象的地址值计算出来的，
//                  同于一个对象，多次调用返回的结果一样
//                  不同对象不一样
//        s.add("123");
//        s.add("hello");
//        s.add("world");
//        s.add("it");
//        Iterator<String> it = s.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        Second
//        hashCode();
        Student s1 = new Student("sunjiuchao", 18);
        Student s2 = new Student("lironghao", 36);
        Student s3 = new Student("liudehua", 63);
        Student s4 = new Student("liudehua", 63);
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
//    可以重写哈希值：哈希值是根据对象的属性值计算出来的，
//                  同于一个对象，多次调用返回的结果一样

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println(s);

    }
}
