package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp06 {
    public static void main(String[] args) {
        String content="hanshunping sphan nnhan";
        //String content="123-abc";
       // String regStr="^[0-9]+[a-z]*";
        // String regStr="^[0-9]+\\-[a-z]+$";
        String regStr="han\\B";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println("找到"+matcher.group(0));
        }
    }
}
