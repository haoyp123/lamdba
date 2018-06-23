package com.learn.use;

import java.time.LocalDate;

public class Book {
    private  int id;
    private int price;
    private String type;
    private LocalDate date;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }

    public Book(int id, int price, String type, LocalDate date) {
        this.id = id;
        this.price = price;
        this.type = type;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
