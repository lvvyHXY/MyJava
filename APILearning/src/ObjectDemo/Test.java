package ObjectDemo;

public class Test {
    //Objects三大方法
    //toString
    //equals
    //clone
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(s.equals(sb));
        System.out.println(sb.equals(s));
    }
}
