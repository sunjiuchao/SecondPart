package Lession.Lession01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        /**
         * 用户名密码保存到本地
         * 都独占一行
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("输入账户：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        FileWriter fw = new FileWriter("day11\\b.txt");
        fw.write(username);
        fw.write("\r\n");
        fw.write(password);
        fw.close();

    }
}
