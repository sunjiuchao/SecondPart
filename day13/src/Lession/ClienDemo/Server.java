package Lession.ClienDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(10086);
        while (true){
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

            ds.receive(dp);
            byte[] data = dp.getData();
            int length = dp.getLength();
            System.out.println(new String(data,0,length));
        }
//            ds.close();
    }
}
