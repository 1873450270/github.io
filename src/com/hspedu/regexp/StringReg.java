package com.hspedu.regexp;

public class StringReg {
    public static void main(String[] args) {
        String content="2000年5月8日，工程代号为 Kestrel(美洲红)的JDK1.3发布，JDK1.3" +
                "相对于JDK1.2的改进主要表现在一些类库上(如数学运算和新的 Timer API等)，JNDI服务" +
                "从JDK1.3开始被作为一项平台级服务提供(以前JNDI仅仅是一项扩展)，使用CORBA IIOP来" +
                "实现RMI的通信协议等。这个版本还对 Java 2D做了很多改进，提供了大量新的 Java 2D " +
                "API，并且新添加了 JavaSound类库。JDK1.3有一个修正版本JDK 1.3.1,工程代号为 " +
                "Ladybird（瓢虫)，于2001年5月17日发布。" ;
       content = content.replaceAll("JDK1\\.3|JDK1\\.4","JDK");
        System.out.println(content);

        content="13888889999";
        if(content.matches("1(38|39)\\d{8}")){
            System.out.println("验证成功");
        }else{
            System.out.println("验证失败");
        }
        System.out.println("================");
        content="hello#abc-jack12smith~北京";
        String[] split = content.split("#|-|~|\\d+");
        for (String s : split) {
            System.out.println(s);
        }

    }
}
