package com.learn;

import java.util.concurrent.Callable;
import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("不适用lamdba表达式");
            }
        };
        Runnable r2 = () ->{
            System.out.println("使用lamdba表达式");
        };
        System.out.println( "==============" );
        Callable<String> c1= () -> { return  "hello" ;};
        Callable<String> c2= () -> "hello";
        c1.call();
        c2.call();
        System.out.println( "==============" );
        //1加到10
        Function<Integer,Integer> f1=(a)->{
            int sum=0;
            for(int i=0;i<=a;i++){
                sum+=i;
            }
            return sum;
        };
        System.out.println(f1.apply(10));
    }
}
