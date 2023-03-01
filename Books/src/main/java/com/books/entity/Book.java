package com.books.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor

public class Book {
    
    private String id;

    private String title;



    private String author;

    private int yearPublished;

    private double price;

    public Book(String theGreatGatsby, String s, Date date) {
    }
}
