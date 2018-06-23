package com.learn.use;

import org.junit.Test;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserLambda {
    @Test
    public void  test1(){
        String request="itemId=1&userId=abc&tradeId=1234&suber=900410";
        Map<String, String> collect = Stream.of(request.split("&")).map(x -> x.split("=")).collect(Collectors.toMap(x -> x[0], x -> x[1]));
        System.out.println(collect);
    }
    private List<Book> getBooks(){
        List<Book> books=new ArrayList();
        books.add(new Book(1,122,"javaeeq",LocalDate.parse("2018-07-01")));
        books.add(new Book(2,142,"javaeewr",LocalDate.parse("2018-07-01")));
        books.add(new Book(3,162,"javaee",LocalDate.parse("2018-07-01")));
        books.add(new Book(4,612,"javaeef",LocalDate.parse("2018-07-01")));
        books.add(new Book(5,132,"javaee",LocalDate.parse("2018-07-01")));
        books.add(new Book(6,142,"javaeef",LocalDate.parse("2018-07-01")));
        books.add(new Book(7,12,"javaee",LocalDate.parse("2018-07-01")));
        books.add(new Book(8,112,"javaefe",LocalDate.parse("2018-07-01")));
        books.add(new Book(9,192,"javaexe",LocalDate.parse("2018-07-01")));
        books.add(new Book(0,112,"javsaee",LocalDate.parse("2018-07-01")));

        return books;
    }
    @Test
    public void  test2(){
        List<Book> books = getBooks();
        System.out.println(books);
        List<Integer> collect = books.stream().map(x -> x.getId()).collect(Collectors.toList());
        String collect1 = books.stream().map(x -> x.getId() + "").collect(Collectors.joining(","));
        System.out.println(collect1);
        Set<String> collect2 = books.stream().map(x -> x.getType()).collect(Collectors.toSet());
        System.out.println(collect2);

    }
}
