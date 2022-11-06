package Lession.InetAdress;

import java.io.IOException;
import java.net.*;

public class SendTeacher {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        int port = 8888;
        String concent = "V6用尽,爱即消失";
//        String concent = "V6用尽,爱即消失";
//        String concent = "hello啊";
        byte[] bytes = concent.getBytes();
        InetAddress address = InetAddress.getByName("192.168.20.172");
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,port);
        ds.send(dp);
        ds.close();
    }
}
