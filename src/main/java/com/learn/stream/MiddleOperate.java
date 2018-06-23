package com.learn.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiddleOperate {
    public static void main(String[] args) {
       /* Arrays.asList(1,2,3,4,5,6).stream().filter(x -> x%2==0).forEach(System.out::println);
        int sum = Arrays.asList(1, 2, 3, 4, 5, 6).stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
        Integer max = Arrays.asList(1, 2, 3, 4, 5, 6).stream().max((a, b) -> a - b).get();
        Integer min = Arrays.asList(-1,0,1, 2, 3, 4, 5, 6).stream().min((a, b) -> a - b).get();
        long count = Arrays.asList(-1, 0, 1, 2, 3, 4, 5, 6).stream().count();
        double asDouble = Arrays.asList(-1, 0, 1, 2, 3, 4, 5, 6).stream().mapToInt(x -> x).average().getAsDouble();
        Optional<Integer> any = Arrays.asList(-2,-1, 0, 1, 2, 3, 4, 5, 6).stream().filter(x -> x % 2 == 0).findAny();
        Optional<Integer> first = Arrays.asList(-2, -1, 0, 1, 2, 3, 4, 5, 6).stream().filter(x -> x % 2 == 0).findFirst();
        Optional<Integer> any1 = Arrays.asList(-2, -1, 0, 1, 2, 3, 4, 5, 6).stream().filter(x -> x % 2 == 0).sorted().findAny();
        Optional<Integer> first1 = Arrays.asList(-2, -1, 0, 1, 2, 3, 4, 5, 6).stream().filter(x -> x % 2 == 0).sorted((a, b) -> b - a).findFirst();
        Arrays.asList("1","java","ee","oracle").stream().sorted((a,b)->a.compareTo(b)).forEach(System.out::println);
        Arrays.asList("ora","java","ee","oracle").stream().anyMatch(s->s.startsWith("o"));
        //1-50所有偶数
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(50).filter(x -> x % 2 == 0).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
        Arrays.asList("ora","java","ee","oracle").stream().collect(Collectors.toSet());
        List<Integer> collect1 = Stream.iterate(1, x -> x + 1).limit(50).sorted((a, b) -> b - a).skip(10).limit(10).collect(Collectors.toList());
        Integer integer = Stream.of("11", "22", "33", "44").map(x -> Integer.valueOf(x)).max((a, b) -> a - b).get();
        Arrays.asList("ora","java","ee","oracle").stream().map(User::new).forEach(x->System.out.println(x));*/
        //并行和串行流
        Stream.iterate(1, x -> x + 1).parallel().sequential().peek(x ->{
            System.out.println(Thread.currentThread().getName());
        }).limit(200).forEach(System.out::println);

    }
}
