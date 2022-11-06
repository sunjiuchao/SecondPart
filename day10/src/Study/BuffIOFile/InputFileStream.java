package Study.BuffIOFile;

import java.io.*;

public class InputFileStream {
    public static void main(String[] args) throws IOException {
/**
 * 利用缓冲流结合数组，进行文件拷贝
 * 法一：
 *
 * */

//        创建一个直接缓冲输入流
//        在底层创建了一个默认长度为8192的字节数组
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\study\\blue.gif"));

//        创建一个直接缓冲输出流
//        在底层创建了一个默认长度为8192的字节数组
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10\\bule.gif"));

        int b ;
        while (((b = bis.read()) != -1)) {
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
