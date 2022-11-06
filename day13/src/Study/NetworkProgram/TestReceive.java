package Study.NetworkProgram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestReceive {
    public static void main(String[] args) throws Exception {
        //找端口
        DatagramSocket dgs = new DatagramSocket(1024);
        //创建箱子
        byte[] bytes = new byte[1024];
        //创建数据包，接收数据
        DatagramPacket dgp = new DatagramPacket(bytes, bytes.length);
        //接收数据包
        dgs.receive(dgp);
        //获取数据包里面的东西
        byte[] data = dgp.getData();//返回数据包缓冲区
        int len = dgp.getLength();//返回要发送的数据包的长度或接收的数据的长度
        String s = new String(bytes, 0, len);//data,bytes都一样
        System.out.println(s);
        dgs.close();

    }
}
