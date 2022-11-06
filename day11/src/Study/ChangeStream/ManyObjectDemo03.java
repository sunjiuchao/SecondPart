package Study.ChangeStream;

import Study.Student;

import java.io.*;
import java.util.Objects;

public class ManyObjectDemo03 {
    public static void main(String[] args) throws Exception {
        Student stu1 = new Student("杜子疼", "123456");
        Student stu2 = new Student("徐小傲", "234567");
        Student stu3 = new Student("测小傲", "345678");
        Student stu4 = new Student("徐傲逗", "456789");
//        写
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\D.txt"));
        oos.writeObject(stu1);
        oos.writeObject(stu2);
        oos.writeObject(stu3);
        oos.writeObject(stu4);
        oos.close();

//        读
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\D.txt"));
        while (true){
            try {
                Object o = ois.readObject();
                System.out.println(o);
            } catch (EOFException e) {
                break;
            }
        }


    }
}
