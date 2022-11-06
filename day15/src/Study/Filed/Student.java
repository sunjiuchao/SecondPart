package Study.Filed;

public class Student {
    public String name;
    public int age;
    public String gender;
    private int money = 300;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", money=" + money +
                '}';
    }
}
