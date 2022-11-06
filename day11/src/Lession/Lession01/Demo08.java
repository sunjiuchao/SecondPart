package Lession.Lession01;

import java.io.*;
import java.nio.charset.Charset;

/**
 * java中没有把字符流转换为字节流的方法（无意义）
 *  在jdk11之前，使用转换流
 *  在jkd11之后，使用FileReader
 */
public class Demo08 {
    public static void main(String[] args) throws IOException {
        //method1();
        //method2();
        //method3();
        //JDK11之后
        FileReader fr = new FileReader("C:\\Users\\lcm\\Desktop\\a.txt", Charset.forName("gbk"));
        int ch;
        while ((ch = fr.read()) != -1){
            System.out.println((char) ch);
        }
        fr.close();
    }

    private static void method3() throws IOException {
        //转换输出流的参数需要的是一个字节输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\lcm\\Desktop\\b.txt"),"utf-8");
        osw.write("好好学习,天天向上");
        osw.close();
    }

    // JDK11之前的解决方案
    private static void method2() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\lcm\\Desktop\\a.txt"),"gbk");
        int ch;
        while ((ch = isr.read()) != -1){
            System.out.println((char) ch);
        }
        isr.close();
    }

    private static void method1() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\lcm\\Desktop\\a.txt");
        int ch;
        while ((ch = fr.read()) != -1){
            System.out.println((char) ch);
        }

        fr.close();
    }
}
