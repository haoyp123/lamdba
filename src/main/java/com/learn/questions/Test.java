package com.learn.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> collect = Arrays.asList(1, 2, 3, 4, 5, 6).stream().map(a -> a + 1).filter(a -> a % 2 != 0).collect(Collectors.toList());
        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream().map(a -> a + 1).filter(a -> a % 2 != 0);
        Stream<String> a1 = Arrays.asList(1, 2, 3, 4, 5, 6).stream().flatMap(a -> Arrays.stream(String.valueOf(a).split("a")));

    }
}
