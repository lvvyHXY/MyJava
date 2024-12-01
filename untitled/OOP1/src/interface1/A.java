package interface1;
//用interface定义
public interface A {
    //JDK8前接口中只能定义常量和抽象方法
    public static final String SCHOOL_NAME = "hello1";
    //定义常量可以省略 public static final
    String SCHOOL_NAME2 = "hello2";
    //定义抽象方法可省略public abstract
    public abstract void run();
    String go();
}
