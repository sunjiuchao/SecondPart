package Study.priview;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo03 {
    public static void main(String[] args) throws IOException {
//        创建字符流对象
        FileReader fr = new FileReader("day11\\a.txt");

//        读取数据
        //一次读取一个字符
        //        int ch;
        //        while ((ch = fr.read()) != -1){
        //            System.out.println((char) ch);
        //        }

        //一次读取多个字符

        char[] chars = new char[1024];
        int len;
        while ((len = fr.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }

//
//        释放资源
        fr.close();
    }
}
