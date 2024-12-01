package HomeWork;

public class Manager extends Employee{
    public Manager(){}
    public Manager(String ID,String name,double income){
        super(ID,name,income);
    }
    @Override
    public void work(){
        System.out.println("经理在工作：管理其他人");
    }
    @Override
    public void eat(){
        System.out.println("经理在吃鱼");
    }
}
