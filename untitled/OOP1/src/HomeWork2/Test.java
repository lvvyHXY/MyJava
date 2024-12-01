package HomeWork2;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.eat();
        if(a1 instanceof Dog){
            Dog d = (Dog)a1;
            d.lookHome();
        }
        System.out.println("===================");
        Animal a2 = new Cat();
        a2.eat();

        if(a2 instanceof Cat)
        {
            Cat c = (Cat)a2;
        c.catchMouse();
        }
    }
}
