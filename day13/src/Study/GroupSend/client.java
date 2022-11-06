package Study.GroupSend;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class client {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        int port = 6678;
        String concent = "V6用尽,爱即消沉";
        byte[] bytes = concent.getBytes();
        InetAddress address = InetAddress.getByName("192.168.20.211");
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,port);
        ds.send(dp);
        ds.close();
    }
}
