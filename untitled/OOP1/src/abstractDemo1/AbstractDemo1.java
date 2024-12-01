package abstractDemo1;

public class AbstractDemo1 {
    public static void main(String[] args) {
        //核心特点：得到了抽象方法的能力但是失去了创建对象的能力
        //不能创建对象
        // A a1 = new A();//错误: abstract type 'A' cannot be instantiated
        B b1 = new B();
        b1.show();
    }
}
