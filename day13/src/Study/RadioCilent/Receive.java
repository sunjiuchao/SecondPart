package Study.RadioCilent;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(1025);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ds.receive(dp);
        byte[] data = dp.getData();
        int length = dp.getLength();
        String s = new String(data, 0, length);
        System.out.println(s);
    }
}
