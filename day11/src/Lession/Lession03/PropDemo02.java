package Lession.Lession03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropDemo02 {
    public static void main(String[] args) throws IOException {
//        void   load(Reader reader)字符输入流    加载 将字符输入流中的数据加载到Properties对象中
//        loadMethod();
//        void   store(Writer writer)字符输出流   String comments)将Properties集合中的数据存入字符输出流
        Properties prop = new Properties();
        FileReader fr = new FileReader("day11\\prop.propertise");//        load使用后直接把文件中的数据传进集合
        prop.load(fr);
        FileWriter fw = new FileWriter("day11\\prop.propertise");
        prop.store(fw, "sunpersun");
        fw.close();
        fr.close();
    }

    private static void loadMethod() throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("day11\\prop.propertise");
//        load使用后直接把文件中的数据传进集合
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }
}
