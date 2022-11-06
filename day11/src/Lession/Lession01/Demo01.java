package Lession.Lession01;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day11\\a.txt");
        fw.write("受到伤害",2,2);
//        for (int i = 1; i <= 8192; i++) {//8193
//            fw.write("c");
//        }
        fw.flush();
        fw.close();
    }
}
