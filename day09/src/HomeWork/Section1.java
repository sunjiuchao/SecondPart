package HomeWork;

public class Section1 {
    public static void main(String[] args) {
        int result = calc(10);
        System.out.println(result);
    }
    public static  int calc(int num){
        if(num==0){
            return 0;
        }else {
            return num+calc(num-1);
        }
    }
}
