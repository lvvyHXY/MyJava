package AnLi;

public class HuskyDog extends Dog{
    @Override
    public void eat(){
        System.out.println("一只叫做" + this.getName() +"的" + this.getAge() + "岁的哈士奇正在吃骨头，边吃边拆家");
    }
}
