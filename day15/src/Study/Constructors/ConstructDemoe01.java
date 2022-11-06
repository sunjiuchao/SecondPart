package Study.Constructors;

import java.lang.reflect.Constructor;

public class ConstructDemoe01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
//        返回所有公共构造方法对象的数组 , 获取class对象  getconstructors()
//        constructorsMethod();

//        返回所有构造方法(pubilc和private)对象的数组  getDeclaredConstructors()
//        getDeclearMethod();

//        返回单个公共构造方法对象   getconstructor(获取的类型 ：有参或无参)
//        constructorMethod();

//        返回单个方法构造对象   getDeclearConstructor（paramType）
//        getDeclearConstructorMethod();
    }

    private static void getDeclearConstructorMethod() throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("Study.Constructors.Student");
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor);
    }

    private static void constructorMethod() throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("Study.Constructors.Student");
        Constructor constructor = clazz.getConstructor();
        System.out.println(constructor);

        Constructor constructor1 = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor1);
    }

    private static void getDeclearMethod() throws ClassNotFoundException {
        Class clazz = Class.forName("Study.Constructors.Student");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }

    private static void constructorsMethod() throws ClassNotFoundException {
        Class clazz = Class.forName("Study.Constructors.Student");
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
