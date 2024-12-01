package Practice2;

public class MonkeyEatP {
    public static void main(String[] args) {
        /*有一堆桃子，猴子第一天吃一半加一个，之后都这么吃，第十天没吃就只剩一个了，问最初几个
        *
        * day10  1
        * day9   4
        * day8   10
        * day7   22
        * dayn = ( day(n+1) + 1 ) * 2
        * */
        System.out.println(getNum(1));
    }
    public static int getNum(int day){
        if(day <=0 || day>10){
            System.out.println("输入有误");
            return -1;}
        if(day == 10)
            return 1;
        return (getNum(day+1)+1) * 2;
    }
}
