package ru.geekbrains.java3.java3lesson3.src;

import java.io.Serializable;

public class Book implements Serializable {
    String title;

    public Book(String title) {
        this.title = title;
    }
}
