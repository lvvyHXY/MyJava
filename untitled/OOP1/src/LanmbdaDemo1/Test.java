package LanmbdaDemo1;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal(){
            @Override
            public void cry() {
                System.out.println("🐱叫");
            }
        };
        a.cry();

        // tips:Lambda函数不能简化所有匿名内部类，只能替代函数式接口的匿名内部类
        //  Animal b = () -> System.out.println("Lambda"); //报错：Target type of lambda expression must be an interface
        /*Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生🏊‍");
            }
        };*/
        //Lambda只能简化函数式接口的匿名内部类
        Swim s1 = () -> {
            System.out.println("学生🏊‍");
        };
        s1.swimming();
    }
}

abstract class Animal{
    public abstract void cry();
}
//函数式接口：只有一个抽象方法
@FunctionalInterface
interface Swim{
    void swimming();
}