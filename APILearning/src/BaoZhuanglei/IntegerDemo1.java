package BaoZhuanglei;

public class IntegerDemo1 {
    public static void main(String[] args) {
        Integer i1 = 100;
        System.out.println(i1);
        String str1 = "";
        //整数转二进制，静态方法，返回字符串
        str1 = Integer.toBinaryString(100);
        System.out.println(str1);
        //十进制转八进制
        str1 = Integer.toOctalString(100);
        System.out.println(str1);
        //十进制转十六进制
        str1 = Integer.toHexString(100);
        System.out.println(str1);
        //字符串转整数
        int int1 = Integer.parseInt("123");
        int1++;
        System.out.println(int1);
    }
}
