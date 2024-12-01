package interface1;

public class Test {
    public static void main(String[] args) {
        //认识接口
        System.out.println(A.SCHOOL_NAME);
        //接口也不能创建对象
        //接口用来被类实现，实现接口的类称为实现类，一个类可以同时实现多个接口
        C c = new C();
        System.out.println(c.go());
        c.play();
        c.run();
    }
}
//C为实现类,必须重写所有接口中的全部抽象方法，否则这个类必须定义成抽象类
class C implements A, B {
    @Override
    public void run(){
        System.out.println("Cchongxie run");
    }

    @Override
    public String go() {
        return "CHONGXIEGO";
    }

    @Override
    public void play() {
        System.out.println("CHONGXIE PLAY");
    }
}
