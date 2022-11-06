package Study.TCP2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();//接收数据
        int b;
        while ((b= is.read()) != -1){
            System.out.println((char) b);
        }
//        OutputStream os = accept.getOutputStream();//返回数据
//        os.write("我已收到!".getBytes());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("我已收到!");
        bw.newLine();
        bw.flush();
        bw.close();
        is.close();
        accept.close();
        ss.close();
    }
}
