package lession.FileCreate;

import java.io.File;
import java.io.IOException;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        File file = new File("day09\\aaa");
        if (file.exists() == false){
            //不存在
            file.mkdirs();
        }
        File file1 = new File(file, "a.txt");
        System.out.println(file1.createNewFile());
    }
}
