package Study.priview;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataDemo01 {
    /**
     *注意事项
     * 1.创建输入流
     *  如果文件不存在，创建，要保证父级路径存在
     *  如果存在就清空（默认false）
     * 2.写出数据
     *  如果是int类型的整数，就是ASCLL码
     *  如果是字符串，原样输出
     * 3.关闭文件
     *  每次使用完必须关闭文件释放资源
     */
    public static void main(String[] args) throws IOException {
//        创建字符输出流的对象
        FileWriter fw = new FileWriter("day11\\a.txt",true);
//        写出数据

//        void   write(int c)  写一个字符
//        fw.write(97);
//        fw.write(102);
//        fw.write(99);

//        void   write(char[] cbuf)写入一个字符数组
//        char arr[] = {97,98,99};
//        fw.write(arr);

//        void write(char[] cbuf(数组), int off（开始索引）, int len（写的长度）)写入字符数组的一部分
//        char arr[] = {97,98,99};
//        fw.write(arr,0,2);

//        void write(String str)****写一个字符串**
//        String name = "孙久超sunjiuchao";
//        fw.write(name);


//        void write(String str, int off, int len)写一个字符串的一部分
//        fw.write(name,0,3);
//        String name = "孙久超sunjiuchao";



//        释放资源
        fw.close();
    }
}
