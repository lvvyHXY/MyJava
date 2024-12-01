public class Test {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("坤坤");
        Star proxy = ProxyUtil.createProxy(bigStar);
        String s = proxy.sing("只因");
        System.out.println(s);
        proxy.dance();

    }
}
