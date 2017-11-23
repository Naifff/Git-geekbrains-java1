package ru.geekbrains.java2.dz.dz2.RoumyantsevPA;

public class MyArrayDataException extends RuntimeException {

    private String detail;

    public MyArrayDataException(String detail) {
        super(detail);
        this.detail = detail;
    }

}


