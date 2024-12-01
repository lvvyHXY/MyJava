package DouDiZhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
    //第二种排序方法：把每张牌对应的价值存入Map集合中，再根据价值排序
    //牌盒
    static ArrayList<String> pokers = new ArrayList<>();
    //Map存储牌以及对应价值
    static HashMap<String,Integer> hm = new HashMap<>();
    static{
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

            for (String number : numbers) {
                for (String color : colors) {
                    pokers.add(color + number);
                }
            }
        pokers.add(" 小王");
        pokers.add(" 大王");
        //System.out.println(pokers);
        //添加价值
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",16);
        hm.put("大王",17);
    }
    PokerGame(){
        //洗牌
        Collections.shuffle(pokers);
        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        for (int i = 0; i < pokers.size(); i++) {
            if(i<=2){
                lord.add(pokers.get(i));
            } else if (i % 3 == 0) {
                player1.add(pokers.get(i));
            } else if (i % 3 == 1) {
                player2.add(pokers.get(i));
            }else {
                player3.add(pokers.get(i));
            }
        }
        //排序
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        //看牌
        lookCard("地主牌",lord);
        lookCard("眼花老头",player1);
        lookCard("那个女孩",player2);
        lookCard("我有玉玉症",player3);
    }
    private void order(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //底层是插入排序＋二分查找
                //o2是有序序列的牌
                //o1是要添加的牌
                //获取牌的价值
                String n1 = o1.substring(1);
                int value1 = value(n1);
                String n2 = o2.substring(1);
                int value2 = value(n2);
                int i = value1 - value2;
                i = i == 0?o1.substring(0,1).compareTo(o2.substring(0,1)) : i;
                return i;
            }
        });
    }
    public int value(String num){
        if(hm.containsKey(num)){
            return hm.get(num);
        }else {
            return Integer.parseInt(num);
        }
    }
    private void lookCard(String name,ArrayList<String> list) {
        System.out.print(name + ": ");
        /*StringJoiner sj = new StringJoiner(",","","");
        for (int i = 0; i < list.size(); i++) {
            sj.add(list.get(i));
        }
        System.out.println(sj);*/
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
