package Lession.FileinputDemo02;

import java.io.FileInputStream;
import java.io.IOException;

public class Lession03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day10\\a.txt");
//        一次读取多个数据
//        read读取不到数据时返回 -1
//        为了避免数据跳过，在外层定义一个变量
        int b;
        while ((b = fis.read())!= -1){
            System.out.println((char) b);
        }


        fis.close();

    }
}
