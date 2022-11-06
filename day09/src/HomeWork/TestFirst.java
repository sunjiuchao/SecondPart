package HomeWork;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class TestFirst {
    public static void main(String[] args) {
        File file1 = new File("E:\\TestFile");
        File file2 = new File("E:\\GitFile");
        //获取、打印file1和file2的文件名和目录名；
        System.out.println(file1.getName());
        System.out.println(file2.getName());

        //分别判断file1和file2是否存在；
        System.out.println(file1.exists());
        System.out.println(file2.exists());
        //分别判断file1和file2是否是文件？是否是目录？
        System.out.println(file1.isFile());
        System.out.println(file2.isFile());

    }
}
