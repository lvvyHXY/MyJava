package lineararray;

public class Test {

    public static void main(String[] args){
        WashCard();
    }
    public static void WashCard()
    {
        String [] card = new String[54];//动态初始化
        String [] colors = {"Square","Flower","TAO","Heart"};//静态初始化
        String [] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int index = 0;
        for(int i = 0;i<numbers.length;i++)
        {
            for(int j = 0;j< colors.length;j++)
            {
                card[index++] = colors[j] + numbers[i];
            }
        }
        card[index++] = "SmallKing";
        card[index] = "BigKing";
        for(int i = 0;i<card.length;i++)
        {
            System.out.println(card[i] + " ");
        }
    }
}
