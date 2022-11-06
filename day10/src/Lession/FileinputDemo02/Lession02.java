package Lession.FileinputDemo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lession02 {
    public static void main(String[] args) throws IOException {
        //        创建字节输入流对象，传入关键路径
        FileOutputStream fos = new FileOutputStream("day10\\b.txt");
        FileInputStream fis = new FileInputStream("day10\\a.txt");
//          读取数据
//        注意点字符输入流关联的路径必须是存在的（FileNotFoundException）
//        read读取的是ASCLL码值(int 类型)，所以需要进行强转
//        可以理解为调用read是有一个指针

        fos.write(fis.read());
        fos.write(fis.read());
        fos.write(fis.read());
//        关流

        fos.close();
        fis.close();
    }
}
