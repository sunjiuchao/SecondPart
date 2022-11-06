package Study.Test;

public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
//        1. Class.forName(全类名)
        Class clazz = Class.forName("Study.Test.Student");
        System.out.println(clazz);
//        类名.class
        Class clazz2 = Student.class;
        System.out.println(clazz2);
//        对象.class
        Student s = new Student();
        Class aClass3 = s.getClass();
        System.out.println(aClass3);
    }
}
