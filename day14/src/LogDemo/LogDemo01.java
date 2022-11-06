package LogDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class LogDemo01 {
    private static  final Logger LOGGER = LoggerFactory.getLogger(LogDemo01.class);
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        String next = sc.next();
        try {
            int num = Integer.parseInt(next);
            LOGGER.info("用户输入的姓名为"+next);
        } catch (NumberFormatException e) {
            LOGGER.info("姓名格式有误："+next);
        }
    }
}
