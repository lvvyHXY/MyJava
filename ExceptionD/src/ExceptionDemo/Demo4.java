package ExceptionDemo;

public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //如果try中的问题没有被捕获，则还是会由虚拟机默认处理：红字报错
       /* try {
            System.out.println(arr[11]);
        } catch (ArithmeticException e) {
            System.out.println("数组越界了");
        }*/
        //try中遇到了异常，try中接下来的还会执行吗:不会
        try {
            System.out.println(arr[11]);
            System.out.println("执行了吗");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界了");
        }
        System.out.println("程序继续运行");
    }
}
