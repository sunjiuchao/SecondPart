package Lession.FileinputDemo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lession06 {
    public static void main(String[] args) throws IOException {
        long l1 = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("day10\\bule.gif");
        FileOutputStream fos = new FileOutputStream("day10\\blue1.gif");

        int len;
        while ((len = fis.read())!= -1){
            fos.write(len);
        }

        fis.close();
        fos.close();
        long l2 = System.currentTimeMillis();

        System.out.println(l2-l1);

    }
}
