package Lession.Buffer;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10\\bule.gif"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10\\blue3.gif"));

        int len;
        while ((len = bis.read())!= -1){
            bos.write(len);
        }

        bis.close();
        bos.close();
        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
