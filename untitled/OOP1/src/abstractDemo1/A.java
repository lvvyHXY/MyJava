package abstractDemo1;
public abstract class A {
    private String name;
    private int age;
    public A(){
        System.out.println("A()");
    }
    public A(String name, int age){
        this.name = name;
        this.age = age;
    }
    //可以写抽象方法(用abstract修饰)且没有方法体，也可以不写
    public abstract void show();
}
