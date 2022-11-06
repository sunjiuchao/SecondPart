package Study.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建客户端Socket对象
        Socket socket = new Socket("127.0.0.1",8778);//必须有服务器连接，先运行服务端，
        //2.获取IO流,写数据                                      // 不然报错.ConnectException
        OutputStream os = socket.getOutputStream();
        os.write("hello".getBytes());
        //3.释放资源
        os.close();
        socket.close();
    }
}
