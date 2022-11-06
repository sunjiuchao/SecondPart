package Study.NetworkProgram;
/**
 * UDP发送端
 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 - 创建发送端的Socket对象(DatagramSocket)
 - 创建数据，并把数据打包
 - 调用DatagramSocket对象的方法发送数据
 - 关闭发送端
 */
public class TestSend {
    public static void main(String[] args) throws Exception {
        //找码头
        DatagramSocket dgs = new DatagramSocket();
        //打包礼物
        //创建数据，并把数据打包
        //DatagramPacket(byte[] buf, int length, InetAddress1 address, int port)
        //构造一个数据包，发送长度为 length的数据包到指定主机上的指定端口号。
        String s = "V6怠尽，爱即消沉";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("192.168.20.211");
        int prot = 1024;
        //创建数据包 打包数据
        DatagramPacket dgp = new DatagramPacket(bytes, bytes.length,address,prot);
        //发送数据包
        dgs.send(dgp);
        dgs.close();
    }
}
