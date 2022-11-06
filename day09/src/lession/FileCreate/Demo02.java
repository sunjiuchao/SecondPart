package lession.FileCreate;

import java.io.File;

public class Demo02 {
    public static void main(String[] args) {
        File file = new File("E:\\TestFile\\aa");
        boolean delete = file.delete();
        System.out.println(delete);
    }
}
