package ZuoYe.demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShopTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101,"阿三面馆");
        map.put(102,"阿四粥馆");
        map.put(103,"阿五米馆");
        map.put(104,"阿六快递");

        Set<Integer> list = map.keySet();
        for (Integer key : list) {
            String s = map.get(key);
            System.out.println(key+"--"+s);
        }
        System.out.println("================");
        Set<Map.Entry<Integer, String>> list1 = map.entrySet();
        for (Map.Entry<Integer, String> re : list1) {
            System.out.println(re.getKey() + "--" + re.getValue());
        }
        System.out.println("================");

        map.forEach((k,v)->{
            System.out.println(k+"--"+v);
        });
    }
}
