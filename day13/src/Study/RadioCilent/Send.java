package Study.RadioCilent;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Send {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String s = "未满18岁禁止发送任何内容";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("255.255.255.255");
        int port = 1025;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
        ds.send(dp);
        ds.close();

    }
}
