package HomeWork3;

public class Mouse implements USB{
    @Override
    public void insert() {
        System.out.println("鼠标接入电脑");
    }

    @Override
    public void exit() {
        System.out.println("鼠标已拔出");
    }

    public void click(){
        System.out.println("鼠标单击");
    }
}
