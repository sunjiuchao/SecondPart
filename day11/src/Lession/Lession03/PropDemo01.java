package Lession.Lession03;

import java.util.Properties;
import java.util.Set;

public class PropDemo01 {
    public static void main(String[] args) {

        Properties prop = new Properties();//只用于字符串
        prop.put("李四", "杭州");
        prop.put("傲冥", "河南");
        prop.put("王五", "江西");
//        setProperty
        prop.setProperty("内蒙", "赤峰");
//        getProperty通过键找值
//        stringPropertyNames 获取键集
        Set<String> key = prop.stringPropertyNames();
        for (String k : key) {
            String v = prop.getProperty(k);
            System.out.println(k + " " + v);
        }

//        增put

//        删remove

//        改get

//        查get
    }
}
