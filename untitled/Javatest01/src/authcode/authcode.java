package authcode;

import java.util.Random;

public class authcode {
    public static void main(String[] args) {
        SetAuthcode();
    }
    public static void SetAuthcode()
    {
        String ret = "";
        char []chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<=25)
            chs[i] = (char)(97 + i);
            else
                chs[i] = (char)(65 + i - 26);
        }
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            ret = ret + chs[randomIndex];
        }
        int number = r.nextInt(10);
        ret = ret + number;
        System.out.println(ret);
    }
}
