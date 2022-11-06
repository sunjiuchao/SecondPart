package Lession.GetConstructor;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

//        Constructor<?>[] getConstructors()返回所有公共构造方法对象的数组
/*
       Class clazz = Class.forName("Lession.GetConstructor.Student");
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
*/


//        Constructor<?>[] getDeclaredConstructors()返回所有构造方法对象的数组
/*
        Class clazz = Class.forName("Lession.GetConstructor.Student");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
*/


//        Constructor<T> getConstructor(Class<?>... parameterTypes)返回单个公共构造方法对象
/*
        Class clazz = Class.forName("Lession.GetConstructor.Student");
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor);
*/


//        Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)返回单个构造方法对象
/*        Class clazz = Class.forName("Lession.GetConstructor.Student");
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);
        */
    }
}
