package Study.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建Socket对象（ServerSocket）
        ServerSocket ss = new ServerSocket(8778);
        //2.等待客服端连接
        Socket accept = ss.accept();                    //1.accept方法是阻塞的，作用是等待客户端连接
        //3.等待输入流对象                                //2.客户端创建对象并连接服务器，此时是通过三次握手协议保证和服务器之间的连接
        InputStream is = accept.getInputStream();      //3.针对于客户端来讲，是往外写的，输出流
        int b;                                         //4.针对于服务器来讲，是往里读的，输入流
        while ((b= is.read()) != -1){                  //5.read方法也是堵塞的
            System.out.print((char)b);                 //6.客户端关流时，还会往服务器写一个结束标记的动作
        }                                              //7.最后一步断开连接，通过四次挥手协议保证连接终止
        //4.释放资源
        is.close();
        ss.close();
    }
}
