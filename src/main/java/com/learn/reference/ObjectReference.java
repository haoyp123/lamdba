package com.learn.reference;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

class Too{
    public void too(){
        System.out.println("invoke");
    }
}
class Too2{
    public void hello(String string){
        System.out.println("invoke"+string);
    }
}
class Prod{
  public int prodm(String str){
      return str.length();
  }
    public int prodm(String str,Integer size){
        return str.length()+size;
    }
}
interface Exec{
    public void run(Prod p,String name,Integer size);
        }
public class ObjectReference {
    public static void main(String[] args) {
        Consumer<Too> c1=(too)->new Too().too();
        Consumer<Too> c2=Too::too;
        c1.accept(new Too());
        c2.accept(new Too());
        BiConsumer<Too2,String> bi=(Too2,string)->new Too2().hello(string);
        BiConsumer<Too2,String> bi2=Too2::hello;
        BiFunction<Prod,String,Integer>bf=(Prod,str)->new Prod().prodm(str);
        BiFunction<Prod,String,Integer>bf1=Prod::prodm;
        Exec e1=(p,name,size)->new Prod().prodm(name,size);
        Exec e2=Prod::prodm;
    }
}
