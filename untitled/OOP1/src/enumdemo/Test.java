package enumdemo;

public class Test {
    public static void main(String[] args) {
        A a1 = A.X;
        A a2 = A.Y;
        System.out.println(a1);
        System.out.println(a1.ordinal());//索引
    }
}
