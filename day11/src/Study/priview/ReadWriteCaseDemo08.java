package Study.priview;

import java.io.*;
import java.util.Arrays;

public class ReadWriteCaseDemo08 {
    public static void main(String[] args) throws IOException {
//        案例：读取文件数据排序后再次写到本地文件
//        读出
        BufferedReader br = new BufferedReader(new FileReader("day11\\b.txt"));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int[] arr = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            int i1 = Integer.parseInt(s1[i]);
            arr[i] = i1;
        }
//        排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        写如
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11\\sort.txt"));
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+" ");
            bw.flush();
        }
        br.close();

    }
}

