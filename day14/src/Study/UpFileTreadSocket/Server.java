package Study.UpFileTreadSocket;


import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        //接收客户端上传的文件，上传之后给客户端反馈
        ServerSocket ss = new ServerSocket(15978);
        while (true) {
            //接收客户端的数据
            Socket accept = ss.accept();
            ThreadSocket ts = new ThreadSocket(accept);
            new Thread(ts).start();
        }
//        ss.close();


    }
}
