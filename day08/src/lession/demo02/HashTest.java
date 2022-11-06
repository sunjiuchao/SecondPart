package lession.demo02;

import java.util.HashMap;

public class HashTest {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();
        Student stu1 = new Student("sunjiuchao", 12);
        Student stu2 = new Student("adfgf", 23);
        Student stu3 = new Student("dlfjhu", 32);
        Student stu4 = new Student("sunjiuchao", 12);
        map.put(stu1,"北京");
        map.put(stu2,"上海");
        map.put(stu3,"杭州");
        map.put(stu4,"北京");

        map.forEach((v,k)->{
            System.out.println(v+"--->"+k);
        });
    }
}
