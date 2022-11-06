package lession.ArraySum;

public class Test {
    public static void main(String[] args) {
        getSum(new int[]{1,2,3},new int[]{4,5,6});
    }
    public static int getSum(int[]... num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int i1 : num[i]) {
                System.out.println(i1);
            }
        }
        return 1;
    }
}
