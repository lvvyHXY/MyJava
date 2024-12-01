package HomeWork;

public class Cooker extends Employee{
    public Cooker(){}
    public Cooker(String ID,String name,double income){
        super(ID,name,income);
    }
    @Override
    public void work(){
        System.out.println("厨师在工作：做饭");
    }
    @Override
    public void eat(){
        System.out.println("厨师在吃肉");
    }
}
