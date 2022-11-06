package Study.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.Stream;

public class ByteStream {
    public static void main(String[] args) throws IOException {
//        创建字节流输出对象
//        如果文件存在，清空
//        如果文件不存在，就创建
        FileOutputStream fos = new FileOutputStream("day10\\a.txt",true);//true续写开关，默认false

        byte  arr[] = {97,98,99};
//        写数据
//        注意，直接覆盖文件中的数据
        fos.write(arr);
//        换行
        fos.write("\r\n".getBytes());
//        write(数据，起始索引 从哪里开始写，写几个)
        fos.write(arr,1,1);
//        释放资源
        fos.close();
    }
}
