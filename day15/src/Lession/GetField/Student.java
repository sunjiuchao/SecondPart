package Lession.GetField;

public class Student {

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    private Student(String name) {
        this.name = name;
    }

    public String name;
    public int age;
    public String gender;
    private int money = 200;

    @Override
    public String toString() {
        return "学生类{" +
                " 姓名='" + name + '\'' +
                ",年龄=" + age +
                ",性别='" + gender + '\'' +
                ",余额=" + money +
                '}';
    }
}
