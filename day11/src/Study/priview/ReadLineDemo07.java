package Study.priview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineDemo07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day11\\b.txt"));
//        String s = br.readLine();
//        String s1 = br.readLine();
//        String s2= br.readLine();
//        String s3= br.readLine();
//        readLine一次读一行，如果读不到数据返回null
//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3); //null


//        一次读一整行，到回车换行为止，但是回车换行不会被读取
        String line;
        while ((line = br.readLine())!=null ){
            System.out.println(line);
        }

        br.close();
    }
}
