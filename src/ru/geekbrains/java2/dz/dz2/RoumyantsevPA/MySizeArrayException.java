package ru.geekbrains.java2.dz.dz2.RoumyantsevPA;

public class MySizeArrayException extends RuntimeException {

    private String detail;

    public MySizeArrayException(String detail) {
        super(detail);
        this.detail = detail;
    }

}
