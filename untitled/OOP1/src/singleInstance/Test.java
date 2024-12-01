package singleInstance;

public class Test {
    public static void main(String[] args) {
        A a1 = A.a;
        A a2 = A.a;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1 == a2);
        //A.a = null; 用final修饰A a就可以不让他被修改了，或者用private修饰，但是得写一个public方法来获取a
        System.out.println(A.a);

        System.out.println("----------------------------------");
        B b1 = B.getObject();
        B b2 = B.getObject();
        System.out.println(b1);
        System.out.println(b2);
    }
}
