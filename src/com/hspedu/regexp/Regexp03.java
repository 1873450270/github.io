package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp03 {
    public static void main(String[] args) {
        String content="a11c8abc _ABCy  @";
        // String regStr ="[^a-z]";
        //String regStr ="[A-Z]";
       // String regStr="abc";
        //String regStr="a((?i)b)c";
        //String regStr="a(?i)bc";
       // String regStr="[^0-9]";
        //String regStr="\\D";
        //String regStr="\\w";
       // String regStr="\\W";
        //String regStr="\\s";
        //String regStr="\\S";
        String regStr=".";
       Pattern pattern = Pattern.compile(regStr/*,Pattern.CASE_INSENSITIVE*/);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println("找到"+matcher.group(0));
        }


    }
}
