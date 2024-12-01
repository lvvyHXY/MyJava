package gas.station.payment;

public class SilverCard extends Card{
    public SilverCard(String carId,String name,String phoneNumber,double money){
        super(carId,name,phoneNumber,money);
    }
    @Override
    public void consume(double money){
        System.out.println("您当前消费" + money);
        System.out.println("优惠后价格" + 0.9 * money);
        if(getMoney() < 0.9 * money){
            System.out.println("余额不足");
        }
        //修改卡里余额
        setMoney(getMoney() - 0.9 * money);
        }
    }
