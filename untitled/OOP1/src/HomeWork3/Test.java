package HomeWork3;

public class Test {
    public static void main(String[] args) {
        Computer c = new Computer();
        Keyboard k = new Keyboard();
        Mouse m = new Mouse();
        c.use(k);
        System.out.println("=====================");
        c.use(m);
    }
}
