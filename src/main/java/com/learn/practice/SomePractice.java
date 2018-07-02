package com.learn.practice;

import java.util.stream.Stream;

/**
 * 编 写 一 个 求 和 函 数， 计 算 流 中 所 有 数 之 和。 例 如， int addUp(Stream<Integer>
 * numbers)；
 */
public class SomePractice {
    public static int addUp(Stream<Integer>numbers){
        Integer reduce = numbers.reduce(0, (ace, x) -> ace + x);
        return reduce;
    }
}
