package com.learn;

import java.util.function.Consumer;
import java.util.function.Supplier;

class Person{
    public Person(){
        System.out.println("invoke");
    }
    public Person(String p){
        System.out.println("invoke"+p);
    }
        }
public class ConstructorReference {
    public static void main(String[] args) {
        Supplier<Person> s1=()->new Person();
        Supplier<Person> s2=Person::new;
        Consumer<String> c1=Person::new;
    }
}
