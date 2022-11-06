package Lession.GetField;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        System.out.println("======================返回所有公共成员变量对象的数组===========================");
//        Field[] getFields()返回所有公共成员变量对象的数组
        Class clazz = Class.forName("Lession.GetField.Student");
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("======================返回所有成员变量对象的数组=============================");
//        Field[] getDeclaredFields()返回所有成员变量对象的数组
        Class clazz2 = Class.forName("Lession.GetField.Student");
        Field[] declaredFields = clazz2.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("======================返回单个公共成员变量对象===============================");
//        Field getField(String name)返回单个公共成员变量对象
        Class clazz3 = Class.forName("Lession.GetField.Student");
        Field field = clazz3.getField("name");
        System.out.println(field);
        System.out.println("======================返回单个成员变量对象===================================");
//        Field getDeclaredField(String name)返回单个成员变量对象
        Class clazz4 = Class.forName("Lession.GetField.Student");
        Field declaredField = clazz4.getDeclaredField("money");
        System.out.println(declaredField);
    }
}
