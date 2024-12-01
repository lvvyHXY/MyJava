import java.sql.SQLOutput;
import java.util.*;

public class T {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        Stack<Car> parkingLot = new Stack<Car>();//停车场
        Queue<Car> waitingQueue = new LinkedList<Car>();//等候区
        HashMap<String,Integer> hm = new HashMap<>();//存车子拍照以及停车时间
        int position = 0;//停车场车位
        int waitingPosition= 0;//等候区位置
        while(true){
            String line = sc.nextLine();
            String[] splits = line.split(" ");
            String action = splits[0];
            String carNumber = splits[1];
            int arrivalTime = Integer.parseInt(splits[2]);
            Car car = new Car(carNumber,arrivalTime);
            if(action.equals("E")){
                System.out.println("程序结束");
                break;
            }
            if(action.equals("A")){
                //到达就入停车场栈，创建Car对象
                if(parkingLot.size() < n) {
                    parkingLot.push(car);
                    System.out.println("车辆"+ car.getNumber() + "停在了停车场的" + ++position);
                }
                else {
                    //等候区
                    waitingQueue.offer(car);
                    System.out.println("车辆"+ car.getNumber() + "停在了等待区" + ++waitingPosition);
                }
            } else if (action.equals("D")) {
                if (parkingLot.isEmpty()){
                    System.out.println("the car not in park");
                    break;
                }//这句没问题


                //临时栈存储让路的车
                Stack<Car> temp = new Stack<>();
                //一个个出栈看是不是一辆车
                while(!parkingLot.isEmpty()){
                //表示每一个出栈的车
                    Car carInStack = parkingLot.pop();
                    System.out.println("出栈的是"+ carInStack.getNumber());
                    if(carInStack.getNumber().equals(car.getNumber())){
                        int wholeTime = car.getArrivalTime() - carInStack.getArrivalTime();
                        System.out.println("车辆"+ car.getNumber() + "停车了" + wholeTime + "分钟");
                        break;
                    }else {
                        temp.push(carInStack);
                    }
                    if (parkingLot.isEmpty()){
                        System.out.println("the car not in park");
                    }
                }
                //把临时栈里面的车加回去，再把临时区域的车停进去
                    while(!temp.isEmpty()){
                        parkingLot.push(temp.pop());
                    }
                    //把等候区的车加进去
                    while(parkingLot.size() < n && !waitingQueue.isEmpty()){
                    parkingLot.push(waitingQueue.poll());
                    }
            }
        }
    }
}
class Car{
    String number; // 车牌号
    int arrivalTime; // 到达时间

    public Car(String number, int arrivalTime) {
        this.number = number;
        this.arrivalTime = arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return arrivalTime == car.arrivalTime && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, arrivalTime);
    }
}
