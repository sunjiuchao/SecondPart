package preview.Map;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstDemo {
    public static void main(String[] args) {
//        Entry键值对，一一对应
//        键是唯一的，不能重复的，值可以重复
        HashMap<String, String> map = new HashMap<>();
        map.put("itheima001","xunjiuchao01");
        map.put("itheima002","daxingan02");
        map.put("itheima003","liudehua03");
        map.put("itheima004","liudehua04");
        map.put("itheima005","liudehua05");

//        先找键 再找值
        firstMethod(map);

        System.out.println("========================================================");

//        直接找键值对
        entryMethod(map);

    }

    private static void entryMethod(HashMap<String, String> map) {
        Set<Map.Entry<String, String>> en = map.entrySet();
        for (Map.Entry<String, String> se : en) {
            System.out.println(se.getKey()+"-->"+se.getValue());
        }
    }

    private static void firstMethod(HashMap<String, String> map) {
        Set<String> keys = map.keySet();//获取键
        for (String key : keys) {
            String s = map.get(key);
            System.out.println(key+"-->"+s);
        }
    }
}
