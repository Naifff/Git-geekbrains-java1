package ru.geekbrains.java1.dz.dz7.BashtaEvgenii;

public class Cat {
    public String name;
    private int hungry=(int)(Math.random()*250)+10; //количество корма в условных граммах сырого мяса.
    private boolean full;
    public Cat ( String name , int hungry) {
        this . name = name ;
        do {this .hungry = hungry ;}
        while (hungry<10||hungry>260);
    }
    public Cat (String name) {
        this.name=name;
    }
    public Cat () {}
    public void eat ( Plate p ) {
        int a = p . decreaseFood ( hungry );
        if (a==this.hungry) {
            this.hungry-=a;
            System.out.println("Кот "+name+" сыт и доволен. Он съел "+a+ " корма.");
        }
        else {
            if (a==0) {
                System.out.println("Кот "+name+" не смог поесть из пустой тарерки. Он еще хочет есть на "+this.hungry);
            }
            else {
                System.out.println("Кот " + name + " поел " + (this.hungry -a)+ ", но еще хочет есть на "+a);
                this.hungry =a;
            }
        }
    }

    public boolean isFull() {
        if (this.hungry==0) this.full=true;
        return full;
    }
    public void info() {
        System.out.println("Кот "+name+" голоден на "+hungry);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
