package preview.CountFile;

import java.io.File;
import java.util.HashMap;

public class Count {
    public static void main(String[] args) {
//        统计文件夹中每种文件类型出现的个数
        File path = new File("D:\\soft\\idea\\Data\\jiuye");
        HashMap<String, Integer> map = new HashMap<>();
        getCount(map,path);
        System.out.println(map);


        }

    private static void getCount(HashMap<String, Integer> map, File path) {
        File[] files = path.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                String name = file.getName();
                String[] split = name.split("\\.");
                if (split.length==2){
                    String s = split[1];
                    if (map.containsKey(s)){
                        //存在
                        Integer count = map.get(s);
                        count++;
                        //把已经出现的覆盖掉
                        map.put(s,count);
                    }else {
                        //不存在
                        map.put(s,1);
                    }
                }
            }else {
                getCount(map,file);
            }
        }
    }
}

