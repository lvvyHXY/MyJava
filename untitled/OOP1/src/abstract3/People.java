package abstract3;

public abstract class People {
    private String name;
    private int age;
    //建议final修饰模板方法，不能被子类重写
    public final void write(){
        System.out.println("\t\t\t <标题>");
        //子类要写正文，但是每个都不一样
        writebody();
        System.out.println("\t结尾");
    }
    public abstract void writebody();
}
