package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp05 {
    public static void main(String[] args) {
        String content="a21111111aaaaaahello";
       // String regStr="a{3}";
        // String regStr="1{4}";
        //String regStr="\\d{2}";

        //String regStr="a{3,4}";
        //String regStr="\\d{2,5}";

        //String regStr="1+";
        //String regStr="\\d+";
       // String regStr="1*";

        //String regStr="a1?";
        String regStr="\\d+";
        Pattern pattern = Pattern.compile(regStr/*,Pattern.CASE_INSENSITIVE*/);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println("找到"+matcher.group(0));
        }
    }
}
