package Study.UpFileWhile;

import java.io.*;
import java.net.Socket;

/**
 * 第一个弊端：服务器只能处理一个客户请求，接收完后就关闭了。所以服务器加入while循环机制
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //将本地文件上传到服务器，接收服务器的反馈

        Socket socket = new Socket("127.0.0.1", 15978);
        //读取本地文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day14\\JavaWeb.jpg"));
        //写到服务器网络中的流
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        //通过网络写道服务器中
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }

        //给服务器一个结束标识,告诉服务器文件已经传输完毕
        socket.shutdownOutput();

        //接收服务器发送的反馈
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        bis.close();
        socket.close();
    }
}
