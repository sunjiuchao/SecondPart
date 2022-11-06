package Study.IOStream;

import java.io.*;

public class FileInputStreamdemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\study\\blue.gif");
        FileOutputStream fos = new FileOutputStream("day10\\blue.gif");
        byte[] bytes = new byte[1024];//一次读取多个字节
        int len;
        while ((len = fis.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
