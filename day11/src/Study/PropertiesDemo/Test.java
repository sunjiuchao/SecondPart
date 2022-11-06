package Study.PropertiesDemo;

import com.sun.source.tree.UsesTree;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        /**
         * Properties概述：
         *  是一个map体系的集合类
         *  properties有和IO相关的方法
         *  只有字符串
         */

//        properties在集合中的使用
        Properties prop = new Properties();

//        增
//        prop.put("徐傲","大傻逼");
//        prop.put("测测","是徐傲");
//        prop.put("梁志超","奶奶");
//        System.out.println(prop);
//        删
//        prop.remove("徐傲");
//        System.out.println(prop);
//        改-->put  在此键不存在直接添加，存在直接覆盖。
//        prop.put("徐傲","骂我大傻逼");
//        System.out.println(prop);
//        查
//        get(key)
//        Object sb = prop.get("徐傲");
//        System.out.println(sb);
//        keyset获取对象数据
//        Set<Object> key = prop.keySet();
//        for (Object keys : key) {
//            Object value = prop.get(keys);
//            System.out.println(keys+"--"+value);
//        }
//        entrySet获取对象数据
//        Set<Map.Entry<Object, Object>> map = prop.entrySet();
//        for (Map.Entry<Object, Object> list : map) {
//            System.out.println(list.getKey()+"-->"+list.getValue());
//        }

//        特有方法
        //1.SetProperty添加
        prop.setProperty("江西","徐傲测");
        prop.setProperty("内蒙","奥兹透");
        prop.setProperty("山西","奈求货");
        System.out.println(prop);
        //GetProperty 通过键获取值
        String value = prop.getProperty("山西");
        System.out.println(value);
        //StringPropertyNames
        Set<String> key = prop.stringPropertyNames();
        for (String k : key) {
            String v = prop.getProperty(k);
            System.out.println(k+"-->"+v);
        }
    }
}
