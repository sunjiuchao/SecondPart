package Homework;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day11\\test1.txt");
        fw.write("传智教育");
        fw.close();
        FileWriter fw2 = new FileWriter("day11\\test1.txt",true);
        fw2.write("中国加油");
        fw2.close();
    }
}
