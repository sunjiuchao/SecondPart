package Lession.TCPFileThread;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ThreadSocket implements Runnable{
    private Socket socket;

    public ThreadSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream is =null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        BufferedWriter bw = null;
        try {
            is = socket.getInputStream();//接收网络中的流文件
            bis = new BufferedInputStream(is);
//        将网络中的流文件写道本地
            bos = new BufferedOutputStream(new FileOutputStream("day14\\"+ UUID.randomUUID().toString().replace("-","")+".jpg"));

            int b;
            while ((b = bis.read())!=-1){
                bos.write(b);
            }
            //接收完数据，给客户端反馈
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("收到");
            bw.newLine();
            bw.flush();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
