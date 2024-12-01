package DouDiZhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    //当要操作的东西不好操作时，可以用序号来代为操作，然后根据序号和对象的对应关系来取出对象
    //1.创建Map牌盒：牌，序号，用序号来衡量牌的大小
    //用HashMap，因为排序可以拿到手之后排序，只需要HashMap来确定牌和序号的关系即可
    //因为要操作的是序号（方便操作），所以以序号为键
    static HashMap<Integer,String> hm = new HashMap<>();
    //创建单列集合存储序号
    static ArrayList<Integer> list = new ArrayList<>();
    static{
        System.out.println("欢迎来到斗地主");
        //1.准备牌,只发生一次
        String[] color = {"♠","♥","♣","♦"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        int serialNumber = 1;//序号
        for (String n : number) {
            for (String c : color) {
                hm.put(serialNumber,c+n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber,"小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber,"大王");
        list.add(serialNumber);
        //System.out.println(hm);
    }
    PokerGame(){
        //2.洗牌
        Collections.shuffle(list);
        //3.发牌
        //存入TreeSet中，自动把发的牌排序
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);
            if(i<=2){
                lord.add(serialNumber);
            } else if (i%3 == 0) {
                player1.add(serialNumber);
            } else if (i%3 == 1) {
                player2.add(serialNumber);
            }else {
                player3.add(serialNumber);
            }
        }
        //4.看牌
        lookCard("地主牌",lord);
        lookCard("眼花老头",player1);
        lookCard("那个女孩",player2);
        lookCard("我有玉玉症",player3);
    }
    private void lookCard(String name,TreeSet<Integer> list) {
        System.out.print(name + ": ");
        /*StringJoiner sj = new StringJoiner(",","","");
        for (int i = 0; i < list.size(); i++) {
            sj.add(list.get(i));
        }
        System.out.println(sj);*/
        for (Integer poker : list) {
            System.out.print(hm.get(poker) + " ");
        }
        System.out.println();
    }
}
