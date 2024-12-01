package com.itheima.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CodeUtil {
    public static String getCode(){
        //随机生成验证码
     /*   验证码要求：
        包含大小写A-Z和数字0-9
        字母4个，数字1个
        字母和数字的位置是随机的。
        完成上面的要求之后，自己思考，如果换一个验证码的需求是否可以完成呢？
        比如1：包含大小写A-Z和数字0-9，总长度为5，内容随机的，生成的结果不包含大小写字母o
        比如2：包含大小写A-Z和数字0-9，总共长度为4或5，内容都是随机的，但是数字不能连续*/
        String code = "";
        /*ArrayList<Character> template = new ArrayList<>();
        Collections.addAll(template, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        Collections.shuffle(template);
        for (int i = 0; i < 4; i++) {
            code += template.get(i);
        }*/
        String template = "ABCDEFGHIJKLMNPQRSTUVWXYZabcdefghijklmnpqrstuvwxyz";
        String num = "0123456789";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            code += template.charAt(r.nextInt(template.length()));
        }
        code += num.charAt(r.nextInt(num.length()));
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < code.length(); i++) {
            list.add(code.charAt(i));
            //System.out.println(list);
        }
        Collections.shuffle(list);
        StringBuilder sb = new StringBuilder();
        for (Character c : list) {
            sb.append(c);
        }
        System.out.println(sb);
        return sb.toString();
    }
}
