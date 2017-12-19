package ru.geekbrains.java3.java3lesson3.src;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 8182827774738769170L;

    int id;
    String name;
    Book book;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void info() {
        System.out.println(id + " " + name);
    }
}
