package ZuoYe.demo04;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1930, "乌拉圭");
        hashMap.put(1934, "意大利");
        hashMap.put(1938, "意大利");
        hashMap.put(1950, "乌拉圭");
        hashMap.put(1954, "西德");
        hashMap.put(1958, "巴西");
        hashMap.put(1962, "巴西");
        hashMap.put(1966, "英格兰");
        hashMap.put(1970, "巴西");
        hashMap.put(1974, "西德");
        hashMap.put(1978, "阿根廷");
        hashMap.put(1982, "意大利");
        hashMap.put(1986, "阿根廷");
        hashMap.put(1990, "西德");
        hashMap.put(1994, "巴西");
        hashMap.put(1998, "法国");
        hashMap.put(2002, "巴西");
        hashMap.put(2006, "意大利");
        hashMap.put(2010, "西班牙");
        hashMap.put(2014, "德国");

        //1,根据年份找冠军
        getFirstByYear(hashMap);
        //2,根据冠军找年份
        getFirstByTeam(hashMap);
    }


    private static void getFirstByYear(HashMap<Integer, String> hashMap) {
        //        1,根据年份找冠军
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();

        String value = hashMap.get(year);
        if (value == null) {
            System.out.println("该年没有举办世界杯");
        } else {
            System.out.println("冠军是:" + value);
        }
    }

    private static void getFirstByTeam(HashMap<Integer, String> hashMap) {
        //        2,根据冠军找年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入球队名称");
        String team = sc.next();

        Set<Integer> keys = hashMap.keySet();

        boolean flag = false;
        for (Integer key : keys) {
            String value = hashMap.get(key);
            if (value.equals(team)) {
                flag = true;
                System.out.println(key);
            }
        }

        if (flag == false) {
            System.out.println("没有获得过世界杯冠军");
        }
    }
}