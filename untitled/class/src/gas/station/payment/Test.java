package gas.station.payment;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //办卡需要一个独立的业务：支付机
        GoldenCard goldCard = new GoldenCard("鄂A51214","LEI","18665616520",5000);
        pay(goldCard);
        SilverCard silverCard = new SilverCard("粤A88888","zhou","189484845",2000);
        pay(silverCard);
    }

    //支付机方法
    public static void pay(Card c){
        System.out.println("请刷卡:输入当前消费金额");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);
        if(c.getMoney() >= 0)
        System.out.println("余额还剩:" + c.getMoney());
    }
}