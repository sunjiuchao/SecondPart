package Study.ChangeStream;

import Study.Student;

import java.io.*;
import java.util.ArrayList;

public class ManyObjectDemo04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu1 = new Student("杜子疼", "123456");
        Student stu2 = new Student("徐小傲", "234567");
        Student stu3 = new Student("测小傲", "345678");
        Student stu4 = new Student("徐傲逗", "456789");
        ArrayList<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);

//        写
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\e.txt"));
        oos.writeObject(students);
        oos.close();

//        读
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\e.txt"));
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }

        ois.close();

    }
}
