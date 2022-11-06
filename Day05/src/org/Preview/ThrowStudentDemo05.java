package org.Preview;

import java.util.Scanner;

public class ThrowStudentDemo05 {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scanner.nextLine();
        student.setName(name);
        while (true){
            System.out.println("请输入年龄");
            String age = scanner.nextLine();
            try {
                int i = Integer.parseInt(age);
                student.setAge(i);
                break;
            }   catch (NumberFormatException e){
                System.out.println("请输入整数");
                continue;
            }   catch (AgeOutOfBoundException e){
                System.out.println("输入的范围不符合规定范围");
                continue;
            }
        }
    }
}
