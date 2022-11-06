package StudentScore;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    /*
        键盘录入3个学生信息(姓名,语文成绩,数学成绩,英语成绩)。
        要求按照成绩总分从高到低写入文本文件，最后在从文件中把读取数据显示在控制台
        格式：姓名,语文成绩,数学成绩,英语成绩 举例：林青霞,98,99,100
    */
    public static void main(String[] args) throws IOException {
        System.out.println("欢迎进入学生管理系统");
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        int i = 1;
        while(true){
            System.out.println("请输入第"+i+"个学生信息");
            System.out.println("姓名：");
            String name = sc.next();
            System.out.println("语文成绩：");
            String chinese = sc.next();
            int ch = Integer.parseInt(chinese);
            System.out.println("数学成绩：");
            String math = sc.next();
            int ma = Integer.parseInt(math);
            System.out.println("英语成绩");
            String english = sc.next();
            int en = Integer.parseInt(english);
            Student student = new Student(name, ch, ma, en);
            list.add(student);
            i++;
            if (i==4){
                System.out.println("数据写入完毕！");
                break;
            }
        }
        //写入文件
        for (Student student : list) {
            System.out.println(student);
            String s = student.getName() + "," + student.getChinses() + "," + student.getMath()+ "," + student.getEnglish();
            BufferedWriter bw = new BufferedWriter(new FileWriter("Test02\\exam2.txt", true));
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        }

    }

