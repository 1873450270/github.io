package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp11 {
    public static void main(String[] args) {
        String content="https://www.bilibili.com/video/BV1nV411T7U3/?spm_id_from=333.1007.tianma.1-1-1.click&vd_source=f7e879b3df2808e7fc8a7a50feced221";
        // String regStr="^[\u0391-\uffe5]+$";

        String regStr="^((http|https)://)([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";


        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if(matcher.find()){
            System.out.println("满足格式");
        }else{
            System.out.println("不满足格式");
        }
    }
}
