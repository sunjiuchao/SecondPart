package Study.NetworkCinima;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * 案例需求
 * UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
 * UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
 */
public class SendPort {
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
