package Lession.TCPFile;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",65534);
//        1.把本地文件写到网络流中
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\myfile\\persion file\\微信图片_20221016103632.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
            bos.flush();
        }

        socket.shutdownOutput();//结束写，服务端结束读

//        接收服务端的反馈
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//读取
//        写出
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
        bis.close();
        bos.close();
        socket.close();



    }
}
