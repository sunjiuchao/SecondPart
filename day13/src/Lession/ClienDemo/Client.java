package Lession.ClienDemo;

import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        int port = 10010;
        System.out.println("输入：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String next = sc.next();
            if ("886".equals(next)) {
                break;
            }
            byte[] bytes = next.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
            ds.send(dp);
        }
        ds.close();
    }
}
