package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp07 {
    public static void main(String[] args) {
        String content="hanshunping s7789 nn1189han";
        //String content="123-abc";
        // String regStr="^[0-9]+[a-z]*";
        // String regStr="^[0-9]+\\-[a-z]+$";
        //String regStr="(\\d\\d)(\\d\\d)";
        String regStr="(?<g1>\\d\\d)(?<g2>\\d\\d)";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println("找到"+matcher.group(0));
            System.out.println("第1个分组内容="+matcher.group(1));
            System.out.println("第1个分组内容[通过组名]="+matcher.group("g1"));
            System.out.println("第2个分组内容="+matcher.group(2));
            System.out.println("第2个分组内容[通过组名]="+matcher.group("g2"));
        }
    }
}
