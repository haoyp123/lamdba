package com.learn;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ReferenceMmethod1 {
    static String exec(){
        System.out.println("exec method invoke");
        return "hello";
    }
    static String exec(String name){
        System.out.println("exec method invoke"+name);
        return "hello";
    }
    public static void main(String[] args) {
        Runnable r=()->{};
        Consumer<String>c=(a)->{};
        Consumer<String>c1=a->{};
        Supplier<String > s1=()->{ return  "hello";};
        Function<String,Integer> f=(a)->{return a.length();};
        //输出一个字符串，返回他的大写
        Function<String,String>fn=(a)-> a.toUpperCase();
        System.out.println(fn.apply("java"));
        Consumer<String>cn=(a)-> System.out.println(c);
        cn.accept("se");
        //静态方法的引用
       Supplier<String> s10=() ->ReferenceMmethod1.exec();
       Supplier<String> s2=ReferenceMmethod1::exec;
       System.out.println(s2.get());

    }
}
