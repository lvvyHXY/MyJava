package polymorphsm;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Wolf();
        a1.run();//对于方法：编译看左边，运行看右边 ：
        // 编译时会看Animal有没有run，但运行看的是右边Wolf里面的run
        Animal a2 = new Turtle();
        a2.run();
        System.out.println(a1.name);//成员变量：编译看左边，运行看左边
        System.out.println(a2.name);//Java中多态只强调行为多态和对象多态，没有强调变量多态；
    }
}
