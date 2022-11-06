package Study.BuffIOFile;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        /**
         * 利用缓冲流结合数组，进行文件拷贝
         * 法二：
         *
         * */
//        创建一个直接缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\study\\blue.gif"));

//        创建一个直接缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10\\bule.gif"));

        byte[] bytes = new byte[1024];
        int len ;
        while (((len = bis.read()) != -1)) {
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }
}
