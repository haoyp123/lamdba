package com.learn.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreate {
    public static Stream gen1(String[] str) {
        return Stream.of(str);
    }

    public static Stream gen2(String[] str) {
        return Arrays.asList(str).stream();
    }

    public static void gen3() {
         Stream<Integer>stream=Stream.generate(() -> 1);
         //循环和截取操作
         stream.limit(10).forEach(System.out::println);
    }

    public static void gen4() {
        String str = "abcde";
        IntStream chars = str.chars();
        chars.forEach(x -> System.out.println(x));
    }
    public static void gen5() {
        Stream<Integer>stream=Stream.iterate( 1,x -> x+1);
        stream.limit(10).forEach(System.out::println);
    }


    public static void main(String[] args) {
        String[] str = {"a", "b", "c", "d"};
        Stream stream = gen1(str);
        //gen4();
        //gen3();
        gen5();
    }
}
