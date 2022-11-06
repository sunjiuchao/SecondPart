package Lession.ClassLoader;

public class Test {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器："+systemClassLoader.getName());

        ClassLoader parent = systemClassLoader.getParent();
        System.out.println("平台类加载器："+parent.getName());

        ClassLoader parent1 = parent.getParent();
        System.out.println("启动类加载器："+parent1);
    }
}
