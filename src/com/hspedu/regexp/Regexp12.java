package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp12 {
    public static void main(String[] args) {
        String content="hello33333 j12324-333999111a1551ck14 tom11 jack22 yyy12345 xxx";
        //String regStr="(\\d)\\1";
        //String regStr="(\\d)\\1{4}";
       // String regStr="(\\d)(\\d)\\2\\1";
        String regStr="\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println(" 找到 "+matcher.group(0));
        }

    }
}
