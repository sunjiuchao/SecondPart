package lession;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapDemo01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("李荣浩","作曲家");
        map.put("薛之谦","丑八怪");
        map.put("王力宏","Kiss goodbye");
//        first 遍历
        Set<String> key = map.keySet();
        for (String k : key) {
            String v = map.get(k);
            System.out.println(k+"===>"+v);
        }
        System.out.println("==================================");

//        second遍历
//        set集合存储的是键值对对象
//        Entry对象存储的是键和值
        Set<Map.Entry<String, String>> en = map.entrySet();
        for (Map.Entry<String, String> list : en) {
            String k = list.getKey();
            String v = list.getValue();
            System.out.println(k+"===>"+v);
        }
        System.out.println("==================================");
//        Thid  foreach

        map.forEach(
                new BiConsumer<String, String>() {
                    @Override
                    public void accept(String key, String value) {
                        System.out.println(key+"=="+value);
                    }
                }
        );
        System.out.println("==================================");


//        Forth  foreach
        map.forEach((k,v)->{
            System.out.println(k+"==>"+v);
        });

    }
}
