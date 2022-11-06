package preview.IOFile;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File path = new File("F:\\baidudown\\IOTestFile\\sunjiuchao");
//        boolean res = path.createNewFile();//createNewFile只能创建文件
        boolean mk = path.mkdir();//单击文件夹
        boolean mkdirs = path.mkdirs();//单击文件夹和多级文件夹
        path.delete();//只能删除文件和空文件夹
    }
}
