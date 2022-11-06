package Lession.TCP2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        int b;
        while ((b = is.read()) != -1){
            System.out.println((char) b);//接收客服端数据
        }
        //反馈数据给客户端
        OutputStream os = socket.getOutputStream();//字节
        OutputStreamWriter osw = new OutputStreamWriter(os);//字节转字符
        BufferedWriter bw = new BufferedWriter(osw);//提高效率
        bw.write("你是谁?");
        bw.newLine();
        bw.close();
        osw.close();
        os.close();
        is.close();
        socket.close();
        ss.close();


    }
}
