package RegexDemo1;

import java.util.regex.Pattern;

public class zhengzegaoji {
    public static void main(String[] args) {
        String s = "一aaabbcbcb121323二asjhdash三";
        String regex = "[\\w&&[^_]]+";
        //public String replaceAll(String regex, String targetStr)
        String change = s.replaceAll(regex, "vs");//用replaceAll()替换掉所有符合正则表达式的字符串
        System.out.println(change);
        //用split()分割字符串
        String [] arr = s.split(regex);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
