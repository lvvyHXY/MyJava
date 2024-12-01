package RegexDemo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pachong {
    public static void main(String[] args) {
        String str = "Java8aaabc34567899879875421Java113,Java17";
        String str2 = "abbbbbbbbbbbaaaaaaa";
       /* Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);//匹配子串
        while(m.find()){//find()寻找下一个子串，并在底层记录起始索引和终止索引+1（因为substring（a，b）包头不包尾
            String s = m.group();//group()返回匹配到的子串
            System.out.println(s);
        }*/
        String regex1 = "Java(?=8|11|17)";
        String regex2 = "Java(^(8|11|17))";
        String regex3 = "ab+";//默认贪婪爬取
        String regex4 = "ab+?";//加一个？则是非贪婪爬取
        Pattern p1 = Pattern.compile(regex4);
        Matcher m1 = p1.matcher(str2);
        while(m1.find()){
            String s = m1.group();
            System.out.println(s);
        }
    }
}
