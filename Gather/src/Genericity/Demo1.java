package Genericity;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        //泛型不具备继承性，但是数据可以继承
        method(list1);
        /*method(list2);
        method(list3); 报错*/
        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());//不报错
        method2(list1);
        method2(list2);
        method2(list3);
    }
    //泛型方法中<>里面填了什么，方法就只能接收什么，因为泛型不具备继承性
    public static void method(ArrayList<Ye> e){
        System.out.println("调用了method");
    }
    //但是如果你直接写<E> 那么什么类型都能用，那么如果我要限定某些类和子，父类怎么办
    //用泛型通配符
    // ? extends T T以及其子类
    // ? super T T以及其父类
    //这在泛型类，方法，接口中都适用
    public static void method2(ArrayList<? extends Ye> e){
        System.out.println("调用了method2");
    }
}
class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}
