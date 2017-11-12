package ru.geekbrains.java1.lesson7;


public class Car {
    private String name;
    private String color;
    private int nomer;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Car) {
            Car o = (Car) obj;
            if (name == null || !name.equals(o.getName())) return false;
            if (color == null || !color.equals(o.getColor())) return false;
            if (nomer != o.getNomer()) return false;
            return true;
        }
        return false;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Car car = (Car) o;
//
//        if (nomer != car.nomer) return false;
//        if (name != null ? !name.equals(car.name) : car.name != null) return false;
//        return color != null ? color.equals(car.color) : car.color == null;
//    }



    public Car() {
    }

    public Car(String name, String color, int nomer) {
        this(name, color);
        this.nomer = nomer;
    }

    public Car(String name, String color) {
        this(name);
        this.color = color;
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }
}


