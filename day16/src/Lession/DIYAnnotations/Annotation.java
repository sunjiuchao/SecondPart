package Lession.DIYAnnotations;

public @interface Annotation {
    String name();// default "张三"
    public double height();
    public int age() default 23;
    public Class clazz() default Annotation2.class;
    public Annotation2 an() default @Annotation2;
    public String[] sArr() default {"1","2","3"};

}
