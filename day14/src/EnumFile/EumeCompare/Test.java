package EnumFile.EumeCompare;

public class Test{
    public static void main(String[] args) {
//        String name()                     获取枚举项的名称
/*        String name = Season.SPRING.name;
        System.out.println(name);

        */

//        int ordinal()                     返回枚举项在枚举类中的索引值
/*        int index1 = Season.SPRING.ordinal();
        int index2 = Season.SUMMER.ordinal();
        int index3 = Season.AUTUME.ordinal();
        int index4 = Season.WINTER.ordinal();
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);

        */
//        int compareTo(E  o)               比较两个枚举项,回的是索引值的差值

//        System.out.println(Season.WINTER.compareTo(Season.SPRING));
//        String toString()                 返回枚举常量的名称

/*        String s = Season.SUMMER.toString();
        System.out.println(s);*/
//        static <T> T valueOf(Class<T> type,String name)获取指定枚举类中的指定名称的枚举值
/*        Season spring = Enum.valueOf(Season.class, "SPRING");
        System.out.println(spring);
        System.out.println(Season.SPRING == spring);*/

//        values()                          获得所有的枚举项
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }


    }
}
