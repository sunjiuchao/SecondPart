package org.Review;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("姓名：");
        String name = sc.next();
        stu.setName(name);
        while (true){
            System.out.println("年龄");
            String age1 = sc.next();
            try {
                int age = Integer.parseInt(age1);
                stu.setAge(age);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }catch (RuntimeException e){
                e.printStackTrace();
            }
        }
        System.out.println(stu);
    }
}
