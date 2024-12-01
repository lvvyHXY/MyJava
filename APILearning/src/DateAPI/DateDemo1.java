package DateAPI;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        //构造方法
        Date d2 = new Date(0L);
        System.out.println(d2);
        //set,括号内填毫秒值
        d2.setTime(1000L);
        System.out.println(d2);
        //get:获取当前时间的毫秒值
        long time = d1.getTime();
        System.out.println(time);
    }
}
