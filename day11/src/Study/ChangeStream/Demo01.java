package Study.ChangeStream;

import java.io.*;
import java.nio.charset.Charset;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /**
         *
         * InputStreamReader:把字节流转换为字符流
         * OutputStreamWriter:把字符流转换为字节流
         *  字符流 = 字节流 + 码表
         *  应用场景：不同编码平台之间乱码转换问题
         *
         *  字符流底层有一个缓冲区，调用close方法后，先刷新数据文件在关流，因此需要使用flush
         *  缓冲区的大小为8192，超过之后就说自动刷新
         *
         *
         */
//        luanMa();
//        解决乱码问题
//        method2();
        FileReader fr = new FileReader("day11\\c.txt", Charset.forName("GBK"));
        int b;
        while ((b=fr.read())!=-1){
            System.out.println((char)b);
        }
        fr.close();
    }

    private static void method2() throws IOException {
        OutputStreamWriter sw = new OutputStreamWriter(new FileOutputStream("day11\\c.txt"),"GBK");
        sw.write("好好学习");
        sw.flush();
        sw.close();
        InputStreamReader sr = new InputStreamReader(new FileInputStream("day11\\c.txt"),"GBK");
        int b;
        while ((b=sr.read())!=-1){
            System.out.println((char)b);
        }
        sr.close();
    }

    private static void luanMa() throws IOException {
        FileReader fr = new FileReader("E:\\GitFile\\a.txt");
        int b;
        while ((b= fr.read())!=-1){
            System.out.println((char) b);//此时b为GBK编码格式，所以会乱码
        }
        fr.close();
    }
}
