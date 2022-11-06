package Study.Method;

public class Student {
    private void show(){
        System.out.println("私有show方法，无参数无返回值");
    }
    public void function1(){
        System.out.println("公共，无参数无返回值");
    }
    public void function2(String name){
        System.out.println("公共，有参数无返回值:"+name);
    }
    public String function3(){
        System.out.println("公共，无参数有返回值");
        return "aaa";
    }
    public String function4(String name){
        System.out.println("公共，无参数有返回值"+name);
        return "aaa";
    }
}
