package ExceptionDemo;

public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            System.out.println(arr[11]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String message = e.getMessage();//Index 11 out of bounds for length 10打印此throwable的详细消息字符串
            System.out.println(message);
        }

        try {
            System.out.println(arr[11]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String string = e.toString(); //java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 10
                                            //返回详细信息
            System.out.println(string);
        }

        try {
            System.out.println(arr[11]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();//java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 10
                                //at ExceptionDemo.Demo5.main(Demo5.java:22)
            //红色字体打印上述内容，但并不会停止程序 底层:  System.err.println();
        }
        System.err.print("程序出现了异常");//err红字打印
        System.out.println("程序继续运行");
    }
}
