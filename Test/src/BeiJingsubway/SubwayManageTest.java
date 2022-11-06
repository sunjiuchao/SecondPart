package BeiJingsubway;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class SubwayManageTest {
    public static void main(String[] args) throws Exception {
        /**
         *运行程序,将managers.txt文件中的管理人员信息读取到集合中
         *将读取到的一行数据切割成字符串数组
         *将数组中的元素封装到Manager对象中
         *将Manager对象添加到集合中
         *将subways文件中的地铁站信息读取到另一个集合中
         *给出提示,获取管理人员输入的工号和姓名
         *判断管理人员信息集合中是否包含管理人员输入的工号和姓名,给出对应的登录结果
         */
//      管理员数据读取
        ArrayList<Manager> mlist = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("Test\\managers.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] split = line.split(",");
            Manager manager = new Manager(split[0], split[1], split[2], split[3]);
            mlist.add(manager);
        }
        br.close();

//      地铁数据读取
        ArrayList<Subway> slist = new ArrayList<>();
        BufferedReader br1 = new BufferedReader(new FileReader("Test\\subways.txt"));
        String line1;
        while ((line1 = br1.readLine()) != null) {
            String[] split1 = line1.split(",");
            Subway subway = new Subway(split1[0], split1[1], split1[2]);
            slist.add(subway);
        }
        br.close();

//      给出提示,获取管理人员输入的工号和姓名
//	    判断管理人员信息集合中是否包含管理人员输入的工号和姓名,给出对应的登录结果

        Scanner sc = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println("欢迎进入登录界面");

        boolean into = true;
        while (true) {
            System.out.println("请输入工号:");
            String id = sc.next();
            System.out.println("请输入姓名:");
            String name = sc.next();
            boolean flag = false;
            for (Manager manager : mlist) {
                if (id.equals(manager.getId()) && name.equals(manager.getName())) {
                    flag = true;
                }
            }

            if (flag == true) {
                //登录成功：1.查看地铁站 2.添加地铁站
                System.out.println("恭喜你登录成功！！！");
                System.out.println("==========================================");
                System.out.println("1.查看地铁站 2.添加地铁站");
                System.out.println("请输入你要选择的选项：");
/*
    查看地铁
    4.1. 判断地铁站集合中是否有地铁站信息
    4.2. 如果没有地铁站信息,给出提示
    4.3. 如果有地铁站信息,遍历集合,打印每个地铁站信息
*/
                int num = sc.nextInt();
                if (num == 1) {
                    if (!slist.isEmpty()) {
                        for (Subway subway : slist) {
                            System.out.println(subway.getNumber()+"\t\t\t"+subway.getName()+"\t\t\t" + subway.getWay());
                        }
                    } else {
                        System.out.println("没有地铁相关信息");
                    }
                    break;
                } else if (num == 2) {
                    //添加地铁
                    System.out.println("添加地铁信息");//地铁站编号，地铁站名称，所属路线
                    System.out.println("请输入地铁站编号:");
                    String sid = sc.next();
                    System.out.println("请输入地铁站名称:");//s2026,西直门,4号线
                    String sname = sc.next();
                    System.out.println("请输入地铁站路线:");
                    String sway = sc.next();
                    //写入到文件
                    BufferedWriter bw = new BufferedWriter(new FileWriter("Test\\subways.txt", true));
                    Subway subway = new Subway(sid, sname, sway);
                    //添加地铁信息
                    String arr = sid+","+sname+","+sway;
                    bw.newLine();
                    bw.write(arr);

                    bw.close();


                    slist.add(subway);
                    System.out.println("现有路线");
                    for (Subway subway1 : slist) {
                        System.out.println(subway1);
                    }
                    break;
                }
            } else {
                System.out.println("登录失败，请重新登录");
                continue;
            }
        }

    }
}
