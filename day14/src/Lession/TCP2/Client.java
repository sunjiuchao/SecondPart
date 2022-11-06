package Lession.TCP2;


import java.io.*;
import java.net.Socket;
/*
* 案例需求
* 客户端：发送数据，接受服务器反馈
* 服务器：收到消息后给出反馈
* */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10001);
        OutputStream os = socket.getOutputStream();
        os.write("hello".getBytes());
        socket.shutdownOutput();//发送结束
        //接收服务器反馈
        InputStream is = socket.getInputStream();//获取服务端字节流
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
        isr.close();

        is.close();
        os.close();
        socket.close();

    }
}
