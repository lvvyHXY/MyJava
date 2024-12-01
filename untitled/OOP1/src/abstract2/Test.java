package abstract2;

public class Test {
    public static void main(String[] args)
    {//父类知道子类的行为，还可以更好的支持多态；
        Animal a = new Dog();
        a.cry();
        Animal b = new Cat();
        b.cry();
    }
}
