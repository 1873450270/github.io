package com.hspedu.regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestTemp {
    public static void main(String[] args) {
            String content = "he? llo abc 11.1";
            //String regStr = ".";
            //String regStr ="[.]";
              // String regStr = "\\.";
                 String regStr = "[?]";
            Pattern pattern = Pattern.compile(regStr);
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println("找到=" + matcher.group(0));
            }
        }
    }

