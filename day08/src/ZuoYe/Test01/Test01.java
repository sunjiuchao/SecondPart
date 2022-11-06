package ZuoYe.Test01;

import java.util.Comparator;
import java.util.TreeMap;

public class Test01 {
    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<>();
        map.put(new Student("黑马",16),"北京");
        map.put(new Student("传智",16),"西安");
        map.forEach((student,address)->
                        System.out.println(student+"----"+address)
                );
    }
}
