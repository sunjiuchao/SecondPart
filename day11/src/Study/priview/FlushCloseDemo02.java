package Study.priview;

import java.io.FileWriter;
import java.io.IOException;

public class FlushCloseDemo02 {
    /**
     *  flush 刷新流，还可以进行写数据
     *  close 关闭流，释放资源，关闭之前会刷新流，一旦关闭就不能再写数据。
     */
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day11\\a.txt",true);
        fw.write("鸡哥");
//        fw.flush();//刷新
        fw.close();
    }
}
