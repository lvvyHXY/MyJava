package HomeWork3;

public class Keyboard implements USB{
    @Override
    public void insert() {
        System.out.println("键盘插入");
    }

    @Override
    public void exit() {
        System.out.println("键盘拔出");
    }

    public void input(){
        System.out.println("键盘输入数据");
    }
}
