package Study.NetworkCinima;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 案例需求
 * UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
 * UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
 */
public class ReceivePort {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(1234);
        while (true) {
            byte[] bytes = new byte[1234];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            //接收数据
            ds.receive(dp);

            byte[] data = dp.getData();
            int length = dp.getLength();
            String s = new String(data, 0, length);
            System.out.println(s);
        }

//        ds.close();
    }
}
