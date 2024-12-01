package gas.station.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok可以为类自动添加getter,setter,无参构造器，toString方法等
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String carID;// 车牌号
    private String name;// 车主名字
    private String phoneNumber;// 手机号
    private double money;// 余额

    //存钱
    public void deposit(double money){
        this.money += money;
    }
    //消费
    public void consume(double money){
        this.money -= money;
        if(this.money < 0){
            System.out.println("余额不足");
        }
    }
}
