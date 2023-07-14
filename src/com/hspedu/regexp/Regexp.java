package com.hspedu.regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {
    public static void main(String[] args) {
        String content = "1994年，网景公司推出Netscape浏览器，" +
                "突然让蓄须不明志的高司令开了窍，Java天生就是一次编写，到处运行，" +
                "可以适应于任何平台的东西，为什么不能让它上网呢！绿色小组残部立刻开始" +
                "了针对互联网的Java应用，短短一年时间，Java接着网景浏览器，风靡了起来" +
                "一个原本要用在家电设备上的语言，就这样无心插柳柳成荫的成了“网络版”" +
                "高司令的春天成了微软的噩梦。比尔·盖茨看到了Java的威胁，他告诉微" +
                "软浏览器部门的主管艾达姆：“这可把我吓坏了。我不清楚微软的操作系统要" +
                "为Java的客户应用程序代码提供什么样的东西，而这些东西将足够让它来取代我" +
                "们的市场地位.盖茨的恐惧成为了现实，微软和Sun针对Java打了多年的官" +
                "司，可还是没有阻止Java成为世界上最流行的电脑语言." +
                "高司令这下真的成司令了。";
         //Pattern pattern = Pattern.compile("[a-zA-Z]+");
//        Pattern pattern = Pattern.compile("([0-9]+)|([a-zA-Z]+)");
//        Matcher matcher = pattern.matcher(content);
//        while (matcher.find()){
//             System.out.println("找到："+matcher.group(0));
        String reStr="(\\d\\d)(\\d\\d)";
        Pattern pattern = Pattern.compile(reStr);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println("找到： "+matcher.group(0));
            System.out.println("第1组（）匹配到的值="+matcher.group(1));
            System.out.println("第2组（）匹配到的值="+ matcher.group(2));
        }



    }
    }

