package Study.Filed;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
//        getFields          返回所有的公共成员变量对象数组
//        getFieldsMethod();

//        getDeclareFields   返回所有的成员变量对象数组
//        getDeFieldMethod();

//        getField           返回单个公共成员变量对象
//        getFieldMethod();

//        getclareField      返回单个成员变量对象
        Class clazz = Class.forName("Study.Filed.Student");
        Field declaredField = clazz.getDeclaredField("name");
        Field declaredField1 = clazz.getDeclaredField("money");
        System.out.println(declaredField);
        System.out.println(declaredField1);

    }

    private static void getFieldMethod() throws ClassNotFoundException, NoSuchFieldException {
        Class clazz = Class.forName("Study.Filed.Student");
        Field field = clazz.getField("gender");
        System.out.println(field);
    }

    private static void getDeFieldMethod() throws ClassNotFoundException {
        Class clazz = Class.forName("Study.Filed.Student");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }

    private static void getFieldsMethod() throws ClassNotFoundException {
        //        获得class对象
        Class clazz = Class.forName("Study.Filed.Student");
//        获得Field对象
        Field[] fields = clazz.getFields();
//        赋值或者获取值
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
