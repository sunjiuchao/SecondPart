package preview.Map;

import java.util.HashMap;

public class demo02 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("itheima001","xunjiuchao01");
        map.put("itheima002","daxingan02");
        map.put("itheima003","liudehua03");
        map.put("itheima004","liudehua04");
        map.put("itheima005","liudehua05");

//        map.remove("itheima001");
//        System.out.println(map);
//        System.out.println(map.containsKey("00"));
//        System.out.println(map.containsValue("liudehua04"));
//        map.clear();

        System.out.println(map.size());
        System.out.println(map.isEmpty());

    }
}
