package DateAPI;

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
        //有参构造创建初始日期
        Date d1 = new Date(0L);
        //获取时间并且加上一年毫秒数
        long d1Time = d1.getTime();
        d1Time += 1000L * 60 * 60 * 24 * 365;
        //用set方法修改d1
        d1.setTime(d1Time);
        System.out.println(d1);

    }
}
