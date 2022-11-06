package SendMessage;

import java.io.*;
import java.net.Socket;

import static java.util.UUID.randomUUID;


public class FunctionMethod implements Runnable{

    private Socket socket;
    public FunctionMethod() {
    }
    public FunctionMethod(Socket socket) {
    }

    @Override
    public void run() {
        BufferedInputStream bis = null;
        try {
            InputStream is = socket.getInputStream();
            bis = new BufferedInputStream(is);//读网络流

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Test02\\" + randomUUID().toString().replace("-", "") + ".jpg"));
            //把网流读到本地
            int b;
            while ((b = bis.read())!=-1){
                bos.write(b);
            }
            //读写完，向客户端反馈
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            bw.close();
//            bos.close();
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
//            is.close();
//            ss.close();
        }
    }
}
