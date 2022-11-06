package Study.Method;


import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//        getMethods            获取全部公共成员方法对象的数组，包括继承的
//        getMethods1();

//        getDeclaredMethods    获取所有成员方法对象的数组，不包括继承
//        getDeMethods();


//        getMethod             获取单个公共成员方法对象
//        getMethod3();

//        getDeclaredMethod     获取单个成员对象
//        getDeMethod5();


    }

    private static void getDeMethod5() throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("Study.Method.Student");
        Method show = clazz.getDeclaredMethod("function4", String.class);
        System.out.println(show);
    }

    private static void getMethod3() throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("Study.Method.Student");
        Method method = clazz.getMethod("function2",String.class);
        System.out.println(method);
    }

    private static void getDeMethods() throws ClassNotFoundException {
        Class clazz = Class.forName("Study.Method.Student");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }

    private static void getMethods1() throws ClassNotFoundException {
        Class clazz = Class.forName("Study.Method.Student");
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
