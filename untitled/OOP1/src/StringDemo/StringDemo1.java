package StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1."",推荐用这个
        String s1 = "Hello";
        System.out.println(s1);
        System.out.println(s1.length());
        //2.用构造器,不推荐
        String s2 = new String("World");
        System.out.println(s2);
        char[] chars = {'H','e','l','l','o'};
        String s3 = new String(chars);
        System.out.println(s3);
        byte[] bytes = {97,98,99};
        String s4 = new String(bytes);
        System.out.println(s4);
        //区别：用 "" 写出的会存储到字符串常量池里，且相同的串只占一个空间，但是new每new一次堆里都会新创建一个对象

    }
}
