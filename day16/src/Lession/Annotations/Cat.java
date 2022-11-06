package Lession.Annotations;

public class Cat extends Animal{
    private String name;
    private String age;
    @SuppressWarnings("all")//压制警告
    public Cat(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public void eat() {

    }

    @Deprecated
    public void paly(){
        System.out.println("玩游戏");
    }
}
