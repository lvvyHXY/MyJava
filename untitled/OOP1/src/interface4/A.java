package interface4;

public interface A {
    //接口新增功能
    //1.默认方法（普通实例方法），必须加default修饰
    //默认会用public修饰
    default void go(){
        System.out.println("**go执行了**");
    }
    //2.私有方法,只能在接口内部被调用
    private void run(){
        System.out.println("run执行");
    }
    //3.静态方法
    //只能使用当前接口名调用
    static void show(){
        System.out.println("==show执行了==");
    }
    //增加了接口能力，便于项目的扩展和维护
}
