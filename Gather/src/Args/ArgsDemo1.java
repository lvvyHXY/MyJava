package Args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        //可变参数，方法的形参个数是可以变化的
        //格式 属性类型...名字
        System.out.println(getSum(1, 2, 3, 4, 5));
    }
    //可变参数底层是JAVA创建的一个数组
    public static int getSum(int...args){
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
