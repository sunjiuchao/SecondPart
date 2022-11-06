package PingDuoDuo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        //初始化用户数据
        ArrayList<User> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("Test02\\src\\PingDuoDuo\\mysql_itheima_user.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] split = line.split(",");
            User user = new User(Integer.parseInt(split[0]), split[1], Boolean.parseBoolean(split[2]), Double.parseDouble(split[3]), Double.parseDouble(split[4]));
            list.add(user);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户id(模拟前端提供，纯数字)");
        int id = Integer.parseInt(sc.next());
        //逻辑处理

    }
}