package Lession.FileinputDemo02;

import java.io.UnsupportedEncodingException;

public class Lession05 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 对"中国"进行编码
        String s1 = "中国" ;
        byte[] bytes = s1.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        // 对上述得到的字节数组进行编码
        String s2 = new String(bytes , "UTF-8") ;
        System.out.println(s2);
    }
}
