package abstractDemo1;
//重写完继承的所有抽象方法才能继承，否则他也会变成抽象类
public class B extends A{
    @Override
    public void show()
    {
        System.out.println("B show");
    }
}
