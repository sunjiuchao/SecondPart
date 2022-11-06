package BaiDuLogin;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
//        把用户对象放入集合中
        ArrayList<User> list = new ArrayList<>();

//        开始业务处理
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
//        读文件并存入集合中，事实刷新
            BufferedReader br = new BufferedReader(new FileReader("Test02\\src\\BaiDuLogin\\text.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");
                list.add(new User(split[0], split[1]));
            }
            System.out.println("======================欢迎访问百度====================");
            System.out.println("=====================请选择你要的操作==================");
            System.out.println("**  1.登录 2.注册 3.修改密码 4.删除用户 5.查看所有用户  **");
            int num = Integer.parseInt(sc.next());
            switch (num) {
                case 1://登录
                    System.out.println("========================登录用户=====================");
                    System.out.println("用户名：");
                    String name = sc.next();
                    System.out.println("密码：");
                    String pw = sc.next();
                    int i = 0;
                    for (User user : list) {
                        if (name.equals(user.getName()) && pw.equals(user.getPassword())) {
                            i++;//循环次数
                            System.out.println("登录成功，退出系统Y/N");
                            String s1 = sc.next();
                            if ("N".equals(s1)) {
                                break;
                            } else if ("Y".equals(s1)) {
                                flag = false;
                                System.out.println("已退出");
                            }
                        }
                    }
                    if (i != 1) {
                        System.out.println("登录失败，请重试或者注册");
                    }
                    break;
                case 2://注册
                    System.out.println("========================用户注册=====================");
                    System.out.println("用户名：");
                    String name$ = sc.next();
                    System.out.println("密码：");
                    String pw$ = sc.next();
                    BufferedWriter bw$ = new BufferedWriter(new FileWriter("Test02\\src\\BaiDuLogin\\text.txt", true));
                    bw$.newLine();
                    bw$.write(name$ + "," + pw$);
                    bw$.flush();

                    System.out.println("注册成功！退出系统Y/N。");
                    String s1$ = sc.next();
                    if ("N".equals(s1$)) {
                        break;
                    } else if ("Y".equals(s1$)) {
                        flag = false;
                        System.out.println("已退出");
                    }
                    break;
                case 3://修改密码
                    System.out.println("========================修改密码=====================");
                    System.out.println("用户名：");
                    String name2 = sc.next();
                    System.out.println("用户密码：");
                    String pw2 = sc.next();
                    System.out.println("修改密码：");
                    String pw3 = sc.next();
                    for (User user : list) {
                        if (name2.equals(user.getName()) && pw2.equals(user.getPassword())){
                            user.setPassword(pw3);
                        }
                        //重写加入集合
//                        BufferedWriter bw1 = new BufferedWriter(new FileWriter("Test02\\src\\BaiDuLogin\\text.txt",true));
//                        bw1.newLine();
//                        bw1.write(user.getName()+ "," +user.getPassword());
//                        bw1.flush();
                    }
                    System.out.println("修改成功！退出系统Y/N。");
                    String s2 = sc.next();
                    if ("N".equals(s2)) {
                        break;
                    } else if ("Y".equals(s2)) {
                        flag = false;
                        System.out.println("已退出");
                    }
                    break;
                case 4:
                    //删除用户
                    System.out.println("=======================删除用户====================");
                    System.out.println("用户名：");
                    String name5 = sc.next();
                    System.out.println("密码：");
                    String pw5 = sc.next();
                    for (User user : list) {
                        System.out.println(user.getName()+"\t\t\t"+user.getPassword());
                    }
                    break;
                case 5://查看所有用户
                    System.out.println("=======================查看所有用户====================");
                    System.out.println("用户名：");
                    String name3 = sc.next();
                    System.out.println("密码：");
                    String pw4 = sc.next();
                    for (User user : list) {
                        if (name3.equals(user.getName()) && pw4.equals(user.getPassword())) {
                            for (User user1 : list) {
                                System.out.println(user1.getName()+"\t\t\t\t\t\t\t"+user1.getPassword());
                            }
                            break;
                        }
                    }
                    break;
            }
        }
    }
}

