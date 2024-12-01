package AnLi;

public class PersianCat extends Cat{
    @Override
    public void eat(){
        System.out.println("一只叫做" + getName() +"的" + getAge() + "岁的波斯猫在吃小饼干");
    }
}
