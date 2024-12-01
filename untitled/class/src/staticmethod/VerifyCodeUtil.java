package staticmethod;

import java.util.Random;

public class VerifyCodeUtil {
    // 工具类不需要创建对象，所以构造器建议私有
    private VerifyCodeUtil(){

    }
    public static String generateVerificationCode()
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
        return ret;
    }
}