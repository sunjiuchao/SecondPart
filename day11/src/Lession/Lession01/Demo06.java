package Lession.Lession01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo06 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11\\c.txt"));
        bw.write("黑马程序员");
//        bw.write("\r\n");换行符（不合理）
//        多成员使用不合理，要使用一个不同的系统通配符newLine()
        bw.newLine();
        bw.write("true");
        bw.newLine();
        bw.write('1');
        bw.newLine();
        bw.write("黑马程序员");
        bw.close();
    }
}
