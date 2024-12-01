package DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringJoiner;

public class PokerGame {
    //创建集合当牌盒
    //静态代码块只能调用静态变量
    static ArrayList<String> pokerBox = new ArrayList<>();
    static{
        System.out.println("欢迎来到斗地主");
        //1.准备牌,只发生一次
        String[] color = {"♠","♥","♣","♦"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //遍历添加元素
        for (String c : color) {
            for (String num : number) {
                pokerBox.add(c+num);
            }
        }
        pokerBox.add("小王");
        pokerBox.add("大王");
    }

    PokerGame(){
        //System.out.println(pokerBox);
        //2.洗牌
        Collections.shuffle(pokerBox);
        //System.out.println(pokerBox);
        //3.发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        for (int i = 0; i < pokerBox.size(); i++) {
            if(i<=2){
                lord.add(pokerBox.get(i));
            } else if (i%3 == 0) {
                player1.add(pokerBox.get(i));
            } else if (i%3 == 1) {
                player2.add(pokerBox.get(i));
            }else {
                player3.add(pokerBox.get(i));
            }
        }
        //4.看牌
        lookCard("地主牌",lord);
        lookCard("眼花老头",player1);
        lookCard("那个女孩",player2);
        lookCard("我有玉玉症",player3);
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
