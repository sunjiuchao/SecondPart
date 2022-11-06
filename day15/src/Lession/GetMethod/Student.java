package Lession.GetMethod;

public class Student {

    public void show(){
        System.out.println("公共的无参数的成员方法");
    }
    private void show1(){
        System.out.println("私有的的无参数的成员方法");
    }
    public void show3(String name){
        System.out.println("公共的有参数的成员方法"+name);
    }
    private  String show4(String name){
        System.out.println("私有的的有参数的成员方法"+name);
        return "111";
    }
    public String show5(){
        System.out.println("公共方法，没有参数有返回值");
        return "itheima";
    }
    public String show6(String name1,String name2){
        System.out.println("公共方法，有参数有返回值"+name1+name2);
        return "itheima";
    }

}
