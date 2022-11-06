package BaiDuHot;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<News> list = new TreeSet<>();
        list.add(new News("呼和浩特一女子从家中坠亡，警方：死者与女儿居住，患有焦虑障碍", 1024));
        list.add(new News("广州市昨日新增746例感染者，近三天已转运3.1万人", 997));
        list.add(new News("硬核筑梦！3D动画演示中国空间站建造历程", 1063));
        list.add(new News("梵高名画《播种者》遭泼汤", 166));
        list.add(new News("气候问题抗议者又出手", 789));
        list.add(new News("马斯克现在每天工作17小时", 657));
        list.add(new News("徐傲被杀案,嫌犯一审无罪释放", 4536));
        list.add(new News("警方通报救护车坐地起价：3人被抓", 467));
        list.add(new News("特朗普或于11月14日宣布参加大选", 657));
        list.add(new News("广州称正面临三年以来最严峻疫情", 655));

        while (true) {
            System.out.println("==============================百度热搜==============================");
            for (News news : list) {
                System.out.println(news);
            }
            System.out.println("请选择你要查看的新闻:");
            String s = sc.next();

            //点赞处理
            boolean flag = true;
            while (flag)
            for (News news : list) {
                if (s.equals(news.getTitle())) {
                    System.out.println(news);
                    System.out.println("请输入你的操作：1.点赞 2.评论 3.收藏");
                    int num = Integer.parseInt(sc.next());
                    switch (num) {
                        case 1:
                            news.setCount(news.getCount()+1);//点赞加一
                            flag = false;
                            break;
                        case 2:
                            news.setCount(news.getCount()+2);//评论+2
                            flag = false;
                            break;
                        case 3:
                            news.setCount(news.getCount()+3);//收藏+3
                            flag = false;
                            break;
                        default:
                            System.out.println("请输入正确的选择");
                            continue;
                    }
                    for (News news1 : list) {
                        System.out.println(news1);
                    }
                }
            }

        }
    }
}
