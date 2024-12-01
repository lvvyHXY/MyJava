package ExceptionDemo;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //如果try中没有异常，则跳过catch执行下面的语句
        try {
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界了");
        }
        //如果有多个异常，会从第一个异常跳到catch 中；如果有多种异常，得写多个catch。
        //如果异常的父类放在上面，则所有异常都会被它catch住，所以父类应该放在子类下面
        try {
            System.out.println(arr[10]);
            System.out.println(2 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界了");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (Exception e) {
            System.out.println("出现了异常");
            System.out.println("程序继续运行");
        }
        //JDK7之后，可以把多种异常放入一个catch中中间用"|"分隔开
        try {
            System.out.println(arr[10]);
            System.out.println(2 / 0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("数组越界了");
        }catch (Exception e) {
            System.out.println("出现了异常");
            System.out.println("程序继续运行");
        }
    }
}
