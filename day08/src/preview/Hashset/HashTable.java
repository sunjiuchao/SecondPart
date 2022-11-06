package preview.Hashset;

import java.util.HashSet;

public class HashTable {
    public static void main(String[] args) {
        HashSet<Student> s = new HashSet<>();
        Student s1 = new Student("sunjiuchao", 18);
        Student s2 = new Student("lironghao", 36);
        Student s3 = new Student("sunjiuchao", 18);
        s.add(s1);
        s.add(s2);
        s.add(s3);
//        重写Hashset重写equle和hashcode之后会按照对象的属性值计算哈希值，
//        就可以去除重复

        System.out.println(s);

    }
}
