package HomeWork;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Manager("v001","地平线",100000);
        Employee e2 = new Cooker("v002","小明",50000);
        System.out.println("ID为"+e1.getID()+"的经理"+e1.getName()+"工资为"+e1.getIncome());
        e1.work();
        System.out.println("ID为"+e1.getID()+"的经理"+e1.getName()+"工资为"+e1.getIncome());
        e1.eat();
        System.out.println("ID为"+e2.getID()+"的厨师"+e2.getName()+"工资为"+e2.getIncome());
        e2.work();
        System.out.println("ID为"+e2.getID()+"的厨师"+e2.getName()+"工资为"+e2.getIncome());
        e2.eat();
    }

}
