package Lession.Lession02;

import java.io.*;
import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        对象序列化输出流（对象输出流 ）
//        method2();
//        对象反序列化流（对象操作输入流）

//        method3();
//        把USER里面的对象保存到本地文件
//        method1();

//        录入多个对象
//        method4();

//        读取对象
//        serialVersionUID序列化，对象输出流操作后虚拟机会自动计算一个serialVersionUID，如果对象类的信息被改动
//        再次对象输入流时会再次形成一个版本号到本地，两次serialVersionUID不一致就会报错
//        因此需要手动的取写一个固定的serialVersionUID，让他不被修改
//        stream classdesc serialVersionUID = 6146055948027371245, local class serialVersionUID = 1265315824841177182
        method5();



    }


//



    private static void method5() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\usermessage2.txt"));

        while (true){
            try {
                Object o = ois.readObject();
                System.out.println(o);
            } catch (EOFException e) {
                break;
            }
        }
        ois.close();
    }

    private static void method4() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\usermessage2.txt"));
        Student stu1 = new Student("sunjiuchao", "123123");
        Student stu2 = new Student("wuqingyu", "3123");
        Student stu3 = new Student("wmfakdgfjn", "456123");
        oos.writeObject(stu1);
        oos.writeObject(stu2);
        oos.writeObject(stu3);
        oos.close();
    }

    private static void method3() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\user_message2.txt"));
//        Student o =(Student) ois.readObject();
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }

    private static void method2() throws IOException {
        Student stu = new Student("sunjiuchao", "123456789");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\user_message2.txt"));
        oos.writeObject(stu);
        oos.close();
    }

    private static void method1() throws IOException {
        Student stu = new Student("sunjiuchao", "123456");
        //把USER里面的对象保存到本地文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11\\user_massage.txt"));
        bw.write(stu.getUsername());
        bw.newLine();
        bw.write(stu.getPassword());
        bw.close();
    }
}
