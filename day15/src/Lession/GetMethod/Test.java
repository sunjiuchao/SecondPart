package Lession.GetMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
// Method[] getMethods()返回所有公共成员方法对象的数组，包括继承的
//        Class clazz = Class.forName("Lession.GetMethod.Student");
//        Method[] methods = clazz.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }

// Method[] getDeclaredMethods()返回所有成员方法对象的数组，不包括继承的
        Class clazz2 = Class.forName("Lession.GetMethod.Student");
        Method[] declaredMethods = clazz2.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }


// Method getMethod(String name, Class<?>... parameterTypes)返回单个公共成员方法对象
//        Class clazz3 = Class.forName("Lession.GetMethod.Student");
//        Method show3 = clazz3.getDeclaredMethod("show3", String.class);
//        Student student = (Student) clazz.newInstance();
//        System.out.println(show3.invoke(student, "getDecarelmethod方法"));

// Method getDeclaredMethod(String name, Class<?>... parameterTypes)返回单个成员方法对象*/
//        Class clazz4 = Class.forName("Lession.GetMethod.Student");
//        Method show4 = clazz4.getDeclaredMethod("show4", String.class);
//        show4.setAccessible(true);//方法被私有化修饰，暴力反射
//        Student student1 = (Student) clazz.newInstance();
//        System.out.println(show4.invoke(student1,"sunjiuchao"));

        /*for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
*/
    }
}
