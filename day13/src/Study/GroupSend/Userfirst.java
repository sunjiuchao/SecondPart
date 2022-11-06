package Study.GroupSend;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Userfirst {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket(1024);
        byte[] bytes = new byte[1024];
        int length = bytes.length;
        DatagramPacket dp = new DatagramPacket(bytes,length);
        ms.joinGroup(InetAddress.getByName("192.168.20.211"));
        ms.receive(dp);
        byte[] data = dp.getData();
        int length1 = dp.getLength();
        String s = new String(data, 0, length1);
        System.out.println(s);
        ms.close();

    }
}
