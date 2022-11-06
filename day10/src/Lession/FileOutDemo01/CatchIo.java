package Lession.FileOutDemo01;

import java.io.FileOutputStream;
import java.io.IOException;

public class CatchIo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("day10\\a.txt",true);
            fos.write(97);
            byte[] bytes = "\r\n".getBytes();
            fos.write(bytes);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();            }
        }
    }
}
