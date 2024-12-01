package MathDemo;

public class demo1 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-150));
//向上取整
        System.out.println(Math.ceil(12.3));
        System.out.println(Math.ceil(12.9));
        System.out.println(Math.ceil(-11.9));
        //向下取整
        System.out.println(Math.floor(12.3));
    //四舍五入
        System.out.println(Math.round(12.3));
        System.out.println(Math.round(12.5));
        System.out.println(Math.round(-12.54));
        System.out.println(Math.round(-12.45));
        //取最大值
        System.out.println(Math.max(14,20));
        System.out.println(Math.min(14.5,20.5));
        //a的b次幂
        //tips,第二个数字是小数就是开根号
        System.out.println(Math.pow(2,3));
        //平方根号
        System.out.println(Math.sqrt(4));
        //立方根
        System.out.println(Math.cbrt(8));
        //随机数 范围：0~1
        System.out.println(Math.random());
    }
}
