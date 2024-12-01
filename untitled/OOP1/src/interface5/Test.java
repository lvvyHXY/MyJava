package interface5;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.show();
    }
}
//4.一个类实现多个接口，多个接口有同名默认方法，可以不冲突，这个类重写该方法即可
interface A3{
    default void show(){
        System.out.println("A3");
    }
}
interface B3{
    default void show(){
        System.out.println("B3");
    }
}
class C3 implements A3,B3{
    @Override
    public void show() {
        System.out.println("C3");
    }
}

//3.一个类继承父类，又实现了接口，如果夫类和接口中有同名方法，实现类会优先用父类的
interface A2{
    default void show(){
        System.out.println("A2");
    }
}
class Animal{
    public void show(){
        System.out.println("Animal");
    }
}
class Cat extends Animal implements A2{

}
//2.一个接口继承多个接口，如果多个接口中存在方法签名(返回值)冲突则不支持多继承，也不支持多实现
interface A1{
    void show();
}
interface B1{
    String show();
}
//interface C1 extends A1,B1{}

//1.接口与接口可以多继承，一个接口可以同时继承多个接口
interface A {
    void show1();
}
interface B{
    void show2();
}
interface C extends A,B{
    void show3();
}
class D implements C{

    @Override
    public void show1() {

    }

    @Override
    public void show2() {

    }

    @Override
    public void show3() {

    }
}