package lession.FileCreate;

import java.io.File;
import java.util.HashMap;

public class Demo04 {
    public static void main(String[] args) {
        /*
        * 1.路径不存在的文件夹，返回null
        * 2.路径是存在的文件时存在，返回null
        * 3.路径存在但是文件夹为空文件夹，返回0
        * 4.file表示的是一个有权限的文件夹时，返回null
        *
        * */
        File file = new File("E:\\GitFile\\java资料");
        method(file);
    }

    private static void method(File file) {
        HashMap<String, String> map = new HashMap<>();
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                String name = file1.getName();
                String[] split = name.split("\\.");
                if (split.length == 2){
                    System.out.println(split[0]);
                }
            }else {
                method(file1);
            }
        }
    }
}
