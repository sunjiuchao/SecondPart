package HomeWork;

import java.io.File;
import java.io.IOException;

public class TestSecond {
    public static void main(String[] args) throws IOException {
//        1. 判断file1是否存在？如果不存在，创建这个文件。
//        2. 判断file2是否存在？如果不存在，创建这个目录。
//        3. 判断file3是否存在？如果不存在，创建这个多级目录。
        File file1 = new File("day09\\test.txt");//相对路径
        boolean file = file1.isFile();
        if (!file){
           file1.createNewFile();
       }
	    File file2 = new File("day09");
        boolean directory = file2.isDirectory();
        if (!directory){
            file2.mkdirs();
        }

        File file3 = new File(file2,"aa\\bb\\cc");
        if (file3.exists()) {
            file3.mkdirs();
        }

    }
}
