package SendMessage;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 3300);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要上传文件的路径:");
            String next = sc.next();
            if (next.contains("JavaWeb.jpg")) {
                //上传文件
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(next));//读取本地文件
                OutputStream os = socket.getOutputStream();//写到网络中
                BufferedOutputStream bos = new BufferedOutputStream(os);

                int b;
                while ((b = bis.read()) != -1){
                    bos.write(b);
                }
                socket.shutdownOutput();

                //接收服务端的反馈
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String line;
                while ((line = br.readLine())!=null){
                    System.out.println(line);
                }
                br.close();
                bis.close();
                bos.close();
                os.close();
                socket.close();

                break;
            } else {
                System.out.println("请上传正确的文件!");
                continue;
            }
        }

    }
}
