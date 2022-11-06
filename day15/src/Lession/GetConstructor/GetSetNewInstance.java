package Lession.GetConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetSetNewInstance {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class clazz = Class.forName("Lession.GetConstructor.Student");
        Constructor constructor = clazz.getConstructor(String.class,int.class);      //1.有参构造
        Student student = (Student) constructor.newInstance("张三", 23);
        System.out.println(student);

        Constructor constructor1 = clazz.getConstructor();                           //2.空参构造
        Student student1 = (Student) constructor1.newInstance();
        System.out.println(student1);

        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);//3.私有化有参构造
        declaredConstructor.setAccessible(true);//(临时取消私有化构造方法)
        Student student2 = (Student) declaredConstructor.newInstance("sunjiuchao");
        System.out.println(student2);

    }
}
