package stringharderpractice;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(getRandomString(5));
    }
    public static String getRandomString(int length) {
        String strBase = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder ans = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            int index = r.nextInt(strBase.length());
            char c = strBase.charAt(index);
            ans.append(c);
        }
        return ans.toString();
    }
}
