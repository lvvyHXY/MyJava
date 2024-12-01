package MathDemo;

public class shuixianhua {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 100; i < 999; i++){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if(i == Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3))
            {
                System.out.println(Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3));
                count++;
            }
        }
        System.out.print("水仙花数有："+count);
    }
}
