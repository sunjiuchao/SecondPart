package Lession.Lession01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        /**
         * 读取文件推荐：字符缓冲输入流配合readLine方法
         * 特有方法 ReadLine()一次读取一整行
         */
//创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("day11\\b.txt"));
//        for (int i = 0; i < 3; i++) {
//            String s = br.readLine();
//            System.out.println(s);
//        }        当前读不到就会返回null
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
