package com.preview.LambdaIsVoid;

public class Useprint {
    public void usePr(Print print){
        print.print();
    }
    public void useprint1(Print1 print1,String content){
        print1.print(content);
    }
    public int useprint2(Print2 print2){
        return print2.print();
    }
    public String useprint3(Print3 print3,String content){
        return print3.print(content);
    }

    public String useprint4(Print4 print4,String content ,String auth){
        return  print4.print(content,auth);
    }
}
