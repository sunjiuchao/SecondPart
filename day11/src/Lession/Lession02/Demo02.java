package Lession.Lession02;

import javax.print.DocFlavor;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Demo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        创建用户类
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\user.txt"));
        User user1 = new User("sunjichao", 23);
        User user2 = new User("xaioliku", 67);
        User user3 = new User("ikun", 21);
        ArrayList<User> arr = new ArrayList<>();
        arr.add(user1);
        arr.add(user2);
        arr.add(user3);
        oos.writeObject(arr);
        oos.close();

//        读取集合中的对象
        HashMap<String, Integer> map = new HashMap<>();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\user.txt"));
        ArrayList<User> list =(ArrayList<User>) ois.readObject();
        for (User user : list) {
            map.put(user.getName(),user.getAge());
        }
        System.out.println(map);
        ois.close();
    }
}
