package Lession.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务端对象
        ServerSocket ss = new ServerSocket(10088);
        //等待客户端的链接（accept阻塞方法）
        Socket socket = ss.accept();
        //通过网络输入流读取数据
        InputStream is = socket.getInputStream();//字节输入流
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        is.close();
        socket.close();
        ss.close();


    }
}
