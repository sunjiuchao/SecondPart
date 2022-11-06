package HomeWork;

import java.io.File;

public class TestThird {
    public static void main(String[] args) {
        /*
        请在D盘下创建一个目录“多级目录”，下面随意创建一些文件和目录。
            请编写main()方法，创建以下File对象：
            	File file = new File(“D:\\多级目录”);
            **要求：**
            	遍历这个多级文件夹下的所有内容(包含子文件夹的内容)，判断每个File对象是否文件
            	如果是文件，打印：文件名加后缀名
            	如果是目录，打印：目录名称
       */

        File file = new File("E:\\GitFile");
        ListMethod(file);

    }

    private static void ListMethod(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                String[] split = file1.getName().split("\\.");
                if (split.length == 2){
                    System.out.println("文件"+split[0]+"--->"+split[1]);
                }
            }else {
                System.out.println("文件夹"+file1.getName());
                ListMethod(file1);
            }
        }
    }
}
