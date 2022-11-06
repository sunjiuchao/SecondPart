package Lession.GetConstructor;

public class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "学生类{" +
                " 姓名='" + name + '\'' +
                ",年龄=" + age +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }
}
