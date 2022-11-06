package Study.priview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffereadReadDemo06 {
    public static void main(String[] args) throws IOException {
        //        字符缓冲输入流
        BufferedReader bfr = new BufferedReader(new FileReader("day11\\b.txt"));

        char[] chars = new char[1024];
        int len;
        while ((len = bfr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        bfr.close();
    }
}
