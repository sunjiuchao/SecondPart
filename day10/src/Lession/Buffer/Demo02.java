package Lession.Buffer;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10\\bule.gif"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10\\blue3.gif"));

        byte[] bytes = new byte[1024];

        int len;
        while ((len = bis.read(bytes))!= -1){
            bos.write(bytes,0,len);
        }

        bis.close();
        bos.close();
        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
