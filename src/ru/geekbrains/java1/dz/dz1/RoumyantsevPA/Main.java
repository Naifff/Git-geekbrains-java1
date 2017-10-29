package ru.geekbrains.java1.dz.dz1.RoumyantsevPA;

public class Main {

    public static void main(String[] args) {
        // write your code here
        byte a1 = 0;
        short a2 = 0;
        int a3 = 0;
        long a4 = 0L;
        float a5 = 0f;
        double a6 = 0;
        boolean a7 = true;
        char a8 = 'K';
        String a9 = "][ack the planet";


        System.out.println(nomerTri(1, 2, 3, 4));

        System.out.println(nomerChetire(3, 7));

        nomerPyat(-0);

        System.out.println(nomerShest(-3));

        nomerSem("указанное_имя");

        nomerVosem(2100);

    }

    public static double nomerTri(double a, double b, double c, double d) {
        return a * (b + c / d);
    }

    public static boolean nomerChetire(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
        //return (a+b>=10&&a+b<=20) ? true : false;
        //было в уроке, когда смотрели abs
    }

    public static void nomerPyat(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean nomerShest(int a) {
        return (a < 0);
    }

    public static void nomerSem(String a) {
        System.out.println("Привет, " + a + "!");
    }

    public static void nomerVosem(int a) {
        if (a % 4 == 0 && a % 100 != 0) {
            System.out.println("Високосный");
        } else if (a % 4 == 0 && a % 400 == 0) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }
}
