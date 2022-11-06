package ZuoYe.demo04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "英格兰");
        map.put(1970, "巴西");
        map.put(1974, "西德");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "西德");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        map.put(2010, "西班牙");
        map.put(2014, "德国");

//        第一题
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:");
        int s = sc.nextInt();
        String s1 = map.get(s);
        if (s1.isEmpty()){
            System.out.println("没有举办世界杯");
        }else {
            System.out.println(s1);
        }
//        第二题
        System.out.println("请输入球队名字：");
        String next = sc.next();
        int count=0;
        Set<Map.Entry<Integer, String>> list = map.entrySet();
        for (Map.Entry<Integer, String> key : list) {
            boolean same = key.getValue().contains(next);
            if (same){
                count++;
                System.out.println(key.getKey());
            }
        }
        if (count==0){
            System.out.println("没有获得过世界杯");
        }
    }
}
