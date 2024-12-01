package StringDemo;

public class StringDemo2 {
    public static void main(String[] args) {

    }
    // 帮我生成指定位数的随机验证码，每位可能是大小写字母或数字
    public static String getAuthcode(int n)
    {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String authcode = "";
        for (int i = 0; i < n; i++) {
            int index = (int)(Math.random() * str.length());// [0,1] * 50 = [0,49]
            authcode += str.charAt(index);
        }
        return authcode;
    }
}
