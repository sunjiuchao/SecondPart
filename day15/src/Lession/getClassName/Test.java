package Lession.getClassName;

public class Test {
    /*
    * class类
    * 1.Java文件通过javac命令编译成字节码class文件
    * 2.java运行class文件，字节码会被加载到内传中
    * */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clazz1 = Student.class;
        System.out.println(clazz1);

        Student s = new Student();
        Class clazz2 = s.getClass();
        System.out.println(clazz2);

        Class clazz3 = Class.forName("Lession.getClassName.Student");//全类名：包名+类名
        System.out.println(clazz3);
    }
}
