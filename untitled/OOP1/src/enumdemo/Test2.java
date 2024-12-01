package enumdemo;

public class Test2 {
    //枚举类：做信息的分类和标志
    public static void main(String[] args) {
        //第一种，常量做
        //缺点：参数值不受约束,int可以乱填数字
        move(Constant.UP);
        //2.用枚举做，参数值受约束
        move2(Direction.LEFT);
    }

    public static void move2(Direction direction){
        //根据方向移动
        switch(direction){
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效方向");
        }
    }
    public static void move(int direction){
        //根据方向移动
        switch(direction){
            case Constant.UP:
                System.out.println("向上移动");
                break;
            case Constant.DOWN:
                System.out.println("向下移动");
                break;
            case Constant.LEFT:
                System.out.println("向左移动");
                break;
            case Constant.RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效方向");
        }
    }
}
