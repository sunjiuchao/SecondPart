package Study.Filed;

import java.lang.reflect.Field;

public class SetGetFile {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
//        set(Object obj , Object value)           给指定对象的成员赋值
//        setField();

//        get(Object obj)                          返回指定对象的Field值
        Class clazz = Class.forName("Study.Filed.Student");
        Field field = clazz.getDeclaredField("money");
        field.setAccessible(true);//取消访问检测
        Student student = (Student) clazz.newInstance();
        System.out.println(student);

    }

    private static void setField() throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("Study.Filed.Student");
        Field field = clazz.getField("name");
//        赋值
        Student student = (Student) clazz.newInstance();
        field.set(student,"sunjiuchao");
        System.out.println(student);
    }
}
