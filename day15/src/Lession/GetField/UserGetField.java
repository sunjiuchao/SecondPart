package Lession.GetField;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class UserGetField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("Lession.GetField.Student");
        Field field = clazz.getField("name");
        //通过构造器创建Student对象,给name赋值
        Field Field = clazz.getDeclaredField("name");//获取成员变量对象
        Field.setAccessible(true);
        Constructor declaredConstructor = clazz.getDeclaredConstructor();//获取私有构造
        Student student = (Student) declaredConstructor.newInstance();
        field.set(student,"sunjiuchao");

        Field age = clazz.getField("age");
        age.set(student,13);

        clazz.getField("gender").set(student,"男");

        System.out.println(student);
    }
}
