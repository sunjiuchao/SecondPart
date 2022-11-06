package Lession.TCP;


import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
/*
* 1.accept方法是阻塞的，作用是等待客户端连接
* 2.客户端创建对象并连接服务器，此时是通过三次握手协议保证和服务器之间的连接
* 3.针对于客户端来讲，是往外写的，输出流
* 4.针对于服务器来讲，是往里读的，输入流
* 5.read方法也是堵塞的
* 6.客户端关流时，还会往服务器写一个结束标记的动作
* 7.最后一步断开连接，通过四次挥手协议保证连接终止
*
* */
public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端对象  套接字："127.0.0.1",10088
        Socket socket = new Socket("127.0.0.1",10088);
        //获取网络字节输出流，写数据
        OutputStream os = socket.getOutputStream();

        String s = "你好高斯林";
        byte[] bytes = s.getBytes();
        os.write(bytes);

        os.close();
        socket.close();
    }
}
