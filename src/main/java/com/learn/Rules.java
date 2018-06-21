package com.learn;

import java.util.function.BiFunction;

/**
 * 当抽象方法没有返回值的时候，lamdba执行的时候不管有没有返回值，只管执行方法。
 * 当抽象方法有返回值的时候，lamdba执行的时候需要有返回值且抽象返回返回值保持一致
 */
interface Foo{
    int find ();
}
interface Foo1{
    void get();
}

public class Rules {
    static int exec(){
        return 1;
    }
    static void exec1(){

    }
    public static void main(String[] args) {
        Foo  f1=() -> exec();
        //Foo  f2=() -> exec1();   当抽象方法有返回值的时候，不能执行无返回值的方法
        Foo1 f3=() -> exec();
        Foo1 f4=() -> exec1();   //当抽象方法无返回值的时候，不能执行无返回值的方法
        BiFunction<String,String,Integer> bi=(a,b) ->a.length()+b.length();
        System.out.println(bi.apply("java","se"));
    }
}
