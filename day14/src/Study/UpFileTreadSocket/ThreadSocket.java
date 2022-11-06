package Study.UpFileTreadSocket;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ThreadSocket extends Thread{

    private Socket acceptsocket;
    public ThreadSocket(Socket accept) {
        this.acceptsocket = accept;
    }

    @Override
    public void run() {
        BufferedOutputStream bos = null;
        try {

            //网络中的流从客户端中读取到的数据
            BufferedInputStream bis = new BufferedInputStream(acceptsocket.getInputStream());
            //把数据写道本地，永久化存储
            bos = new BufferedOutputStream(new FileOutputStream("day14\\"+ UUID.randomUUID().toString().replace("-","") +".jpg"));
            int b;
            while ((b = bis.read()) != -1){
                bos.write(b);
            }

            //向客户端反馈
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(acceptsocket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null){}
            try {
                bos.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                acceptsocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
