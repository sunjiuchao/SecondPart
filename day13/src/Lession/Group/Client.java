package Lession.Group;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String s = "你好,我的宝";
        byte[] bytes = s.getBytes();
        int port = 3557;
        InetAddress address = InetAddress.getByName("224.0.1.0");
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,port);
        ds.send(dp);
        ds.close();
    }
}
