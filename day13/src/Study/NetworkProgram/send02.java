package Study.NetworkProgram;

import java.net.*;
import java.util.Scanner;

public class send02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        while (true) {
            String s = sc.next();
            if ("886".equals(s)){
                break;
            }

            byte[] bytes = s.getBytes();//转换为字节数组
            InetAddress address = InetAddress.getByName("127.0.0.1");//获取建立发送端地址
            int port = 1024;//建立端口
            //创建数据包
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,port);
            ds.send(dp);
        }
        ds.close();
    }
}
