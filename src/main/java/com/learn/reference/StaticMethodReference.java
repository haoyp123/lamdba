package com.learn.reference;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class StaticMethodReference {
    static String exec(){
        System.out.println("exec method invoke");
        return "hello";
    }
    static String exec(String name){
        System.out.println("exec method invoke"+name);
        return "hello";
    }
    static String toUpcase(String str){
        return str.toUpperCase();
    }
    static Integer add(String str,String str2){
        return str.length()+str2.length();
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
        //静态方法的引用 --无参数
       Supplier<String> s10=() ->StaticMethodReference.exec();
       Supplier<String> s2=StaticMethodReference::exec;
       System.out.println(s2.get());
        //静态方法的引用 --有参数
        System.out.println("--------------------------");
       Consumer<String>cn1=StaticMethodReference::exec;
       cn1.accept("jack");
        //静态方法的引用 --有输入和输出的
        Function<String ,String>fn1=f1 -> f1.toUpperCase();
        System.out.println(fn1.apply("lamdba"));
        //静态方法的引用 --两个输入一个输出
        BiFunction<String ,String ,Integer>bin1=(str11,str22)->str11.length()+str22.length();
        System.out.println(bin1.apply("java","ee"));


    }
}
