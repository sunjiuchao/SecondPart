package Lession.TPCFileUUID;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(65534);
        while (true){
            Socket socket = ss.accept();//等待客户端链接

            InputStream is = socket.getInputStream();//接收网络中的流文件
            BufferedInputStream bis = new BufferedInputStream(is);
//        将网络中的流文件写道本地
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day14\\"+UUID.randomUUID().toString().replace("-","")+".jpg"));

            int b;
            while ((b = bis.read())!=-1){
                bos.write(b);
            }
            //接收完数据，给客户端反馈
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("收到");
            bw.newLine();
            bw.flush();

            bw.close();
            bis.close();
            bos.close();
            is.close();
            socket.close();
        }
//        ss.close();
    }
}
