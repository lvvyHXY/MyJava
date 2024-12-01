package polymorphsm;

public class Turtle extends Animal{
    String name = "乌龟";
    @Override
    public void run(){
        System.out.println("Turtle run slow");
    }
}
