package CalendarAPI;

import java.util.Calendar;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        //1.Calendar是抽象类，不能直接new，而是通过静态方法获取子类对象
        //2.Calendar的get方法中的month 参数从0开始 0代表一月；国外周日是一周的开始，所以1代表周日

        Calendar c = Calendar.getInstance();
        Date d = new Date(0L);
        c.setTime(d);
        //get获取时间
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        System.out.println(year+"年"+month+"月");
        //set设置时间
        c.set(Calendar.YEAR,2024);
        c.set(Calendar.MONTH,11);
        c.set(Calendar.DAY_OF_MONTH,15);
        System.out.println(c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH)) + "月"  + c.get(Calendar.DAY_OF_MONTH) + "日");
        //add
        c.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH)) + "月"  + c.get(Calendar.DAY_OF_MONTH) + "日");
    }
}
