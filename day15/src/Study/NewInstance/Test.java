package Study.NewInstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/*
* 小结：
*   获取class对象
*       class.forname()
*   获取里面的构造方法
*       getConstruct
*       getDeclaredConstruct()
*   创建对象
*       Public:直接创建newInstance
*       非Public:临时取消检查，然后创建对象：SetAccessible(boolean)暴力反射
* */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        newInstan根据指定的构造方法创建对象(有参)
//        method1();

//        newInstan根据指定的构造方法创建对象(无参)
//        method2();

//        简写，已经废除
//        newInstanceMethod();

//        获取一个私有构造方法并创建对象
        privateConstructMethod();


    }

    private static void privateConstructMethod() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //1.获取class对象
        Class clazz = Class.forName("Study.NewInstance.Student");

        //2.获取一个私有构造方法
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);

        //被private修饰的成员，不可以直接使用
        //如果用反射强行获取并且使用，需要临时取消访问检查
        declaredConstructor.setAccessible(true);

        //直接创建对象
        Student student = (Student) declaredConstructor.newInstance("sunjiuchao");
        System.out.println(student);
    }

    private static void newInstanceMethod() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //        简写格式
        Class clazz = Class.forName("Study.NewInstance.Student");
        Student student = (Student) clazz.newInstance();
        System.out.println(student);
    }

    private static void method2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //1.获取class对象
        Class clazz = Class.forName("Study.NewInstance.Student");
        //获取构造方法对象
        Constructor constructor = clazz.getConstructor();
        //有参创建学生对象
        Student student = (Student) constructor.newInstance();

        System.out.println(student);
    }

    private static void method1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //1.获取class对象
        Class clazz = Class.forName("Study.NewInstance.Student");
        //获取构造方法对象
        Constructor constructor = clazz.getConstructor(String.class , int.class);
        //利用有参创建Student对象
        Student student = (Student) constructor.newInstance("sunjiuchao",23);

        System.out.println(student);
    }
}
