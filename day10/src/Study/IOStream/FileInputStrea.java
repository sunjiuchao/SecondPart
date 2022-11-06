package Study.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStrea {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\study\\blue.gif");
        FileOutputStream fos = new FileOutputStream("day10\\blue.gif");
        int b;
            while ((b = fis.read()) != -1){
                fos.write((char)b);
            }
        fis.close();
        fos.close();
    }
}
