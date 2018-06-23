package com.learn;

import com.sun.glass.ui.Size;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 实例方法的引用
 */
public class ExampleMethodReference {
    public String  put(){
        return "hello";
    }
    public void size(Integer size){
        System.out.println("size:"+size);
    };
    public String  put(String name){
        return "hello"+name;
    }
    public void test(){
        Function<String,String> f4=this::put;
    }
    public static void main(String[] args) {
        Supplier s1= ()-> new ExampleMethodReference().put();
        Supplier s2=new ExampleMethodReference()::put;
        System.out.println(s2.get());
        Consumer<Integer>c1=new ExampleMethodReference()::size;
        c1.accept(20);



    }
}
