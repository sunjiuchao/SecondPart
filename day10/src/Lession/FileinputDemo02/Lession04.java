package Lession.FileinputDemo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lession04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day10\\a.txt");
        FileOutputStream fos = new FileOutputStream("day10\\b.txt");
//        一次读取多个数据
//        read读取不到数据时返回 -1
//        为了避免数据跳过，在外层定义一个变量
        int b;
        while ((b = fis.read())!= -1){
            fos.write(b);
        }
        fos.close();
        fis.close();
    }
}
