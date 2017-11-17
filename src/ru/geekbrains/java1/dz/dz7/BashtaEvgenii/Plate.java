package ru.geekbrains.java1.dz.dz7.BashtaEvgenii;

public class Plate {
    private int food ;
    public Plate ( int food ) {
        this . food = food ;
    }
    public int decreaseFood ( int n ) {
        if (food==0) return 0;
        if (n<=food){
            food -= n ;
            return n;
        }
        else {
            n-=food;
            food=0;
            return n;
        }
    }
    public void info () {
        System . out . println ("\u001B[31m"+ "Сейчас в терелке " + food+" еды."+ "\u001B[0m");
    }
    public void increaseFood (int n) {
        food+=n;
        System . out . println ("\u001B[31m"+ "Мы положили еды в тарелку, теперь в ней: " + food +"\u001B[0m");
    }
}
