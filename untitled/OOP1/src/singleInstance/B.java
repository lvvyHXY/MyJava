package singleInstance;

public class B {
    private static B b;
    private B(){

    }
    //真正需要对象时才创建
    public static B getObject(){
        if(b == null){
            b = new B();
        }
        return b;
    }
}//懒汉式单例
