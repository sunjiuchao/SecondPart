package Study.priview;

import java.io.*;

public class BuffereadWriteDomo05 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11\\b.txt"));
        bw.write(65);
        bw.newLine();//跨平台回车换行
        char arr[] = {97,98,99,100};
        bw.write(arr,0,3);
        bw.write("\r\n");
        String line = "黑马程序员";
        bw.write(line,0,4);
        bw.flush();
        bw.close();
    }
}
