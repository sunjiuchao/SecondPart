package Study.PropertiesDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class LoadStore {
    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
//        1.load将本地的键值对数据读取到集合中
//        FileReader fr = new FileReader("day11\\prop.propertise");
//        //调用完就存入到集中了
//        prop.load(fr);
//        fr.close();
//        System.out.println(prop);

//        2.store将集合中的数据以键值对的形式保存到本地
        prop.put("sunjiuchao","123");
        prop.put("wuyifan","456");
        prop.put("liyifeng","789");
        FileWriter fw = new FileWriter("day11\\f.txt");
        prop.store(fw,"prop");
        fw.close();


    }
}
