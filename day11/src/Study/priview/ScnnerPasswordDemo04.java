package Study.priview;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScnnerPasswordDemo04 {
    public static void main(String[] args) throws IOException {
//        - 案例需求
//
//        将键盘录入的用户名和密码保存到本地实现永久化存储
//        要求用户名独占一行，密码独占一行
//        实现步骤
//        获取用户输入的用户名和密码
        FileWriter fw = new FileWriter("day11\\b.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号");
        String next = sc.next();
        System.out.println("请输入密码");
        String next1 = sc.next();

        fw.write(next);
        fw.write("\r\n");
        fw.write(next1);
        fw.flush();

        fw.close();


//                - 将用户输入的用户名和密码写入到本地文件中
//                - 关流,释放资源
    }
}
