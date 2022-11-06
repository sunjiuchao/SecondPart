package Study.UpFileWhile;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //接收客户端上传的文件，上传之后给客户端反馈
        ServerSocket ss = new ServerSocket(15978);
        while (true) {
            //接收客户端的数据
            Socket accept = ss.accept();
//        网络中的流从客户端中读取到的数据
            BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
            //把数据写道本地，永久化存储
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day14\\copy.jpg"));
            int b;
            while ((b = bis.read()) != -1){
                bos.write(b);
            }

            //向客户端反馈
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();

            bos.close();
            accept.close();
        }
//        ss.close();


    }
}
