package Study.Method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Invoke {
//    invoke(Object obj ,Object args……)     运行方法
//    参数一：obj对象调用该方法
//    参数二：调用方法传递的参数（没有就不用写）
//    返回值：方法的返回值（没有就不用写）
public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
    Class clazz = Class.forName("Study.Method.Student");//获取class对象
//    获取method对象
    Method method = clazz.getMethod("function4", String.class);//单个公共
//    运行方法
    //创建对象，作为方法的调用者
    Student student = (Student) clazz.newInstance();
    //运行方法
    Object result = method.invoke(student, "sunjiuchao");
    System.out.println(result);

}
}
