package com.preview.LambdaIsVoid;

/**
 * 无参无返回值
 */
public class Test {
    public static void main(String[] args) {
        Useprint useprint = new Useprint();

        useprint.usePr(()->{
            System.out.println("打印机");
        });

        useprint.useprint1(
                content -> System.out.println(content), "cntent"
        );

        int i = useprint.useprint2(() -> {
            return 1;
        });
        System.out.println(i);

        String s = useprint.useprint3(content -> content, "11");
        System.out.println(s);

        String s1 = useprint.useprint4((content, auth) -> content +":"+auth, "鸡你太美", "ikun");
        System.out.println(s1);
    }
}
