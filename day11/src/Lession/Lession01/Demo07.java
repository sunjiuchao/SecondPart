package Lession.Lession01;

import java.io.*;
import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) throws IOException {
        /**
         *
         *先读后写
         */
        BufferedReader br = new BufferedReader(new FileReader("day11\\sort.txt"));
        String s = br.readLine();
        String[] arr = s.split(" ");//分割
//        定义一个新数组，把string转换成int类型
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            array[i] = num;
        }
        Arrays.sort(array);
        //写
        //必须BufferedReader分开写 write之后没有文件创建文件，有sort文件则把文件清空
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11\\sort.txt"));
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i]+" ");//需要把码值转换成字符串加上” “
        }


//        关流
        br.close();
        bw.close();
    }
}
