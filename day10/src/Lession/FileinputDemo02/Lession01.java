package Lession.FileinputDemo02;
import java.io.FileInputStream;
import java.io.IOException;
public class Lession01 {
    public static void main(String[] args) throws IOException {
//        创建字节输入流对象，传入关键路径
        FileInputStream fis = new FileInputStream("day10\\a.txt");
//          读取数据
//        注意点字符输入流关联的路径必须是存在的（FileNotFoundException）
//        read读取的是ASCLL码值(int 类型)，所以需要进行强转
//        可以理解为调用read是有一个指针
        int read = fis.read();
        int read2 = fis.read();
        int read3 = fis.read();
        System.out.println((char) read);
        System.out.println((char) read2);
        System.out.println((char) read3);
//        关流
        fis.close();
    }
}
