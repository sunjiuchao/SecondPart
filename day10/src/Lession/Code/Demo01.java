package Lession.Code;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        UTF-8 三个字节表示一个汉字
//        G B K 两个字节表示一个汉字
        String s = "孙久超";

//        编码
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] bytes1 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

//        解码
        String s1 = new String(bytes);
        String s2 = new String(bytes1,"GBK");
        System.out.println(s1);
        System.out.println(s2);
    }
}
