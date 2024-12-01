package ExceptionDemo;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        try {
            System.out.println(arr[10]);
            //原理：try中出现异常会创建一个相应的异常对象：此处new ArrayIndexOutOfBoundsException
            //然后如果和catch中的形参类型一致的话，会被catch捕捉进入catch语句的执行，执行完会继续执行try/catch后的代码
        } catch (ArrayIndexOutOfBoundsException e) {//这里形参是Exception也行但不准确
            System.out.println("数组越界了");
        }
        System.out.println("程序继续运行");
    }
}
