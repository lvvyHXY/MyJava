package RegexDemo1;

public class Regex1 {
    public static void main(String[] args) {
        String regex1 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        System.out.println("21:11:11".matches(regex1));
        String regex2 = "([01]\\d|2[0-3])(:[0-5]\\d){2}";
        System.out.println("21:11:11".matches(regex2));
        String regex3 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex3));
        System.out.println("12345".matches(regex3));

        String regex4 = "(?i)abc";//(?i)后面的忽略大小写
        System.out.println("ABC".matches(regex4));
        System.out.println("abc".matches(regex4));

        String regex5 = "[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        System.out.println("".matches(regex5));
        String regex  = "";
    }
}
