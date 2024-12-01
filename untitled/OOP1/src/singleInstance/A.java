package singleInstance;

public class A {
    //2.定义一个静态变量用来记住本例的唯一对象。
    public  static final A a = new A();
    //1.私有化构造器,确保单例类对外不能创建太多的对象
    private A(){

    }
    //3.如果是private，还得提供一个静态方法返回对象
}


