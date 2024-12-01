package JDK8Time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ZoneDateTime {
    public static void main(String[] args) {
        /*
            static ZonedDateTime now() 获取当前时间的ZonedDateTime对象
            static ZonedDateTime ofXxxx(。。。) 获取指定时间的ZonedDateTime对象
            ZonedDateTime withXxx(时间) 修改时间系列的方法
            ZonedDateTime minusXxx(时间) 减少时间系列的方法
            ZonedDateTime plusXxx(时间) 增加时间系列的方法
         */
//1.获取当前时间对象(带时区)
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

//2.获取指定的时间对象(带时区)1/年月日时分秒纳秒方式指定
        ZonedDateTime time1 = ZonedDateTime.of(2023, 10, 1,
                11, 12, 12, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);

//通过Instant + 时区的方式指定获取时间对象
        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(time2);


//3.withXxx 修改时间系列的方法
        ZonedDateTime time3 = time2.withYear(2000);
        System.out.println(time3);

//4. 减少时间
        ZonedDateTime time4 = time3.minusYears(1);
        System.out.println(time4);

//5.增加时间
        ZonedDateTime time5 = time4.plusYears(1);
        System.out.println(time5);
        //4.4DateTimeFormatter 用于时间的格式化和解析
        /*
            static DateTimeFormatter ofPattern(格式) 获取格式对象
            String format(时间对象) 按照指定方式格式化
        */
//获取时间对象
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

// 解析/格式化器
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm;ss EE a");
// 格式化
        System.out.println(dtf1.format(time));
        //4.5LocalDate 年、月、日
   //     4.5LocalDate 年、月、日
//1.获取当前时间的日历对象(包含 年月日)
        LocalDate nowDate = LocalDate.now();
//System.out.println("今天的日期:" + nowDate);
//2.获取指定的时间的日历对象
        LocalDate ldDate = LocalDate.of(2023, 1, 1);
        System.out.println("指定日期:" + ldDate);

        System.out.println("=============================");

//3.get系列方法获取日历中的每一个属性值//获取年
        int year = ldDate.getYear();
        System.out.println("year: " + year);
//获取月//方式一:
        Month m = ldDate.getMonth();
        System.out.println(m);
        System.out.println(m.getValue());

//方式二:
        int month = ldDate.getMonthValue();
        System.out.println("month: " + month);


//获取日
        int day = ldDate.getDayOfMonth();
        System.out.println("day:" + day);

//获取一年的第几天
        int dayofYear = ldDate.getDayOfYear();
        System.out.println("dayOfYear:" + dayofYear);

//获取星期
        DayOfWeek dayOfWeek = ldDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());

//is开头的方法表示判断
        System.out.println(ldDate.isBefore(ldDate));
        System.out.println(ldDate.isAfter(ldDate));

//with开头的方法表示修改，只能修改年月日
        LocalDate withLocalDate = ldDate.withYear(2000);
        System.out.println(withLocalDate);

//minus开头的方法表示减少，只能减少年月日
        LocalDate minusLocalDate = ldDate.minusYears(1);
        System.out.println(minusLocalDate);


//plus开头的方法表示增加，只能增加年月日
        LocalDate plusLocalDate = ldDate.plusDays(1);
        System.out.println(plusLocalDate);

//-------------
// 判断今天是否是你的生日
        LocalDate birDate = LocalDate.of(2000, 1, 1);
        LocalDate nowDate1 = LocalDate.now();

        MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate1);

        System.out.println("今天是你的生日吗? " + birMd.equals(nowMd));//今天是你的生日吗?
      //  4.6 LocalTime 时、分、秒
// 获取本地时间的日历对象。(包含 时分秒)
        LocalTime nowTime = LocalTime.now();
        System.out.println("今天的时间:" + nowTime);

        int hour = nowTime.getHour();//时
        System.out.println("hour: " + hour);

        int minute = nowTime.getMinute();//分
        System.out.println("minute: " + minute);

        int second = nowTime.getSecond();//秒
        System.out.println("second:" + second);

        int nano = nowTime.getNano();//纳秒
        System.out.println("nano:" + nano);
        System.out.println("------------------------------------");
        System.out.println(LocalTime.of(8, 20));//时分
        System.out.println(LocalTime.of(8, 20, 30));//时分秒
        System.out.println(LocalTime.of(8, 20, 30, 150));//时分秒纳秒
        LocalTime mTime = LocalTime.of(8, 20, 30, 150);

//is系列的方法
        System.out.println(nowTime.isBefore(mTime));
        System.out.println(nowTime.isAfter(mTime));

//with系列的方法，只能修改时、分、秒
        System.out.println(nowTime.withHour(10));

//plus系列的方法，只能修改时、分、秒
        System.out.println(nowTime.plusHours(10));
       // 4.7 LocalDateTime 年、月、日、时、分、秒
// 当前时间的的日历对象(包含年月日时分秒)
        LocalDateTime nowDateTime = LocalDateTime.now();

        System.out.println("今天是:" + nowDateTime);//今天是：
        System.out.println(nowDateTime.getYear());//年
        System.out.println(nowDateTime.getMonthValue());//月
        System.out.println(nowDateTime.getDayOfMonth());//日
        System.out.println(nowDateTime.getHour());//时
        System.out.println(nowDateTime.getMinute());//分
        System.out.println(nowDateTime.getSecond());//秒
        System.out.println(nowDateTime.getNano());//纳秒
// 日:当年的第几天
        System.out.println("dayofYear:" + nowDateTime.getDayOfYear());
//星期
        System.out.println(nowDateTime.getDayOfWeek());
        System.out.println(nowDateTime.getDayOfWeek().getValue());
//月份
        System.out.println(nowDateTime.getMonth());
        System.out.println(nowDateTime.getMonth().getValue());

        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);

        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
    }
}
