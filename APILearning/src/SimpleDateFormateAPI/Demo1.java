package SimpleDateFormateAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        /*
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d1 = new Date();
        //format (日期对象->字符串
        String time1 = sdf.format(d1);
        System.out.println(time1);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String time2 = sdf2.format(d1);
        System.out.println(time2);
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 时:HH 分:mm 秒:ss 星期E");
        String time3 = sdf3.format(d1);
        System.out.println(time3);*/
//把2000-11-11按格式化输出
        String str4 = "2000-11-11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");//要与字符串格式相同才能解析
        Date parsed = sdf1.parse(str4);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");//再创建一个SimpleDateFormat对象来格式化
        String ret = sdf2.format(parsed);
        System.out.println(ret);
    }
}
