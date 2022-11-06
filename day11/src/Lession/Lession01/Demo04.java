package Lession.Lession01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {

        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("day11\\b.txt"));
        //读取数据，一次读取一个数组
        char[] chars = new char[1024];
        int len;
        while ((len = br.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
        br.close();
    }
}
