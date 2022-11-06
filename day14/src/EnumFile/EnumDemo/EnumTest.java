package EnumFile.EnumDemo;

public class EnumTest {
    public static void main(String[] args) {
        String name = Season.SUMER.name;
        System.out.println(name);//名称

        System.out.println(Season.SUMER.ordinal());//索引
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value.name);//遍历
        }

        System.out.println(Season.valueOf(Season.class, "SUMER"));//获取指定名称的枚举值

        System.out.println(Season.WITER.compareTo(Season.SPRING));//索引差

        System.out.println(Season.SUMER.toString());//返回枚举常量的名称
    }
}
