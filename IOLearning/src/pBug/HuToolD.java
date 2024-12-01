package pBug;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static pBug.Demo1.getName;

public class HuToolD {
    public static void main(String[] args) {
        //爬取网页输出字符串
        String oralFamilyName = HttpUtil.get("https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0");
        String oralBoyName = HttpUtil.get("http://www.haoming8.cn/baobao/10881.html");
        String oralGirlName = HttpUtil.get("http://www.haoming8.cn/baobao/7641.html");
        //正则处理
        ArrayList<String> familyNameTemp =(ArrayList<String>)ReUtil.findAll("(\\W{4})(，|。)", oralFamilyName, 1);
        ArrayList<String> boyNameTemp = (ArrayList<String>)ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)",oralBoyName,1);
        ArrayList<String> girlNameTemp = (ArrayList<String>)ReUtil.findAll("(.. ){4}..",oralGirlName,0);
        //数据处理：加年龄性别
        //处理数据
        //姓：把汉字截取出来
        ArrayList<String> familyName = new ArrayList<>();
        for (String s : familyNameTemp) {
            for (int i = 0;i<s.length();i++){
                familyName.add(s.charAt(i) + "");//加一个  "" 把他变成字符串，因为我是字符串类型的集合
            }
        }

        //男生名字：去重
        ArrayList<String> boyName = new ArrayList<>();
        boyNameTemp.stream().distinct().forEach(s -> boyName.add(s));

        //女生名字:分割出来，以空格分隔
        ArrayList<String> girlName = new ArrayList<>();
        for (String s : girlNameTemp) {
            String[] split = s.split(" ");
            for (int i = 0; i < split.length; i++) {
                girlName.add(split[i]);
            }
        }

        //生成
        ArrayList<String> name = getName(familyName, boyName, girlName, 70, 50);
        Collections.shuffle(name);
        //写,hutool的相对路径是相对于class文件的，再out里面找
        FileUtil.writeLines(name, "name.txt","UTF-8");

    }
}
