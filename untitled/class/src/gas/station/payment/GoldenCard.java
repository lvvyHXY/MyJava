package gas.station.payment;

public class GoldenCard extends Card{
    public GoldenCard(String carId,String name,String phoneNumber,double money){
        super(carId,name,phoneNumber,money);
    }
    @Override
    public void consume(double money){
        System.out.println("您当前消费" + money);
        System.out.println("优惠后价格" + 0.8 * money);
        if(getMoney() < 0.8 * money)
        {
            System.out.println("余额不足");
            return;
        }
        //修改卡里余额
        setMoney(getMoney() - 0.8 * money);
        //消费大于200 打印洗车卡
        if(money * 0.8 >= 200){
            printTicket();
        }
        else
            System.out.println("消费不足200无法免费洗车");
    }
    public void printTicket(){
        System.out.println("请打印洗车票");
    }
}
