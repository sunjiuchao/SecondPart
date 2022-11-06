package Lession.InetAdress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress1 {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("supersun");
        InetAddress address = InetAddress.getByName("supersun");
        String hostName = address.getHostName();
        String add = address.getHostAddress();
        System.out.println(hostName);
        System.out.println(add);
    }
}
