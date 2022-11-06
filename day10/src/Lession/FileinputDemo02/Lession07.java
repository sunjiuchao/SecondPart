package Lession.FileinputDemo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lession07 {
    public static void main(String[] args) throws IOException {
        long l1 = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("day10\\bule.gif");
        FileOutputStream fos = new FileOutputStream("day10\\blue2.gif");
        byte[] bytes = new byte[1024];

        int len;
        while ((len = fis.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();
        long l2 = System.currentTimeMillis();

        System.out.println(l2-l1);

    }
}
