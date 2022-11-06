package Lession.FileOutDemo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
//        创建输出流对象
        FileOutputStream fos = new FileOutputStream("day10\\a.txt",true);
//        1.一次写一个
//        fos.write(97);

//        一次写多个
//        byte数组
//        byte bytes[]={97,98,99,100};
//        fos.write(bytes,1,2);
        fos.write(99);
//        字符串转成数组
        byte[] bytes = "\r\n".getBytes();
        fos.write(bytes);
        fos.write(100);

        fos.close();
    }
}
