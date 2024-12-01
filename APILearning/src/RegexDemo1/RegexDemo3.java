package RegexDemo1;

public class RegexDemo3 {
    public static void main(String[] args) {
        //捕获分组
        String str = "我要学学编编编编程程程";
        //\\1：把第一组的拿出来用。。$1，在正则表达式之外用第一组内容
        String ret = str.replaceAll("(.)\\1+", "$1");
        System.out.println(ret);
        //非捕获 （?:。。。) (?=。。。) (?! 。。。)不占用组符号
        String str2 = "我要学学学学学编程程程";
        String ret2 = str2.replaceAll("(?:.)\\1+", "$1");
    }
}
