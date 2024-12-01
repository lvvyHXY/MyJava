package stringharderpractice;

public class Test2 {
    public static void main(String[] args) {
        //1.定义两个字符串
        String strA = "abcde";
        String strB = "cdeab";
        //2.旋转
        System.out.println(checkStr(strA,strB));
    }
    public static boolean checkStr(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            if(strA.equals(strB)){
                return true;
            }
            strA = rotate(strA);
        }
        return false;
    }
    public static String rotate(String str){
        //如果要修改字符串内容
        //1.用subString截取
        //2.先把字符串变成字符数组，再调整数组，再变成字符串
        String first = str.substring(0,1);
        String end = str.substring(1);
        return str.substring(1)+str.charAt(0);
    }
}
