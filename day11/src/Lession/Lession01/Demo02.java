package Lession.Lession01;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day11\\a.txt");
        char[] chars = new char[1024];
        int len;
        while ((len = fr.read(chars)) != -1){
            System.out.println(new String(chars, 0, len));
        }
        fr.close();
    }
}
