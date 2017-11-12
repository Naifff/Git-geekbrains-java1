package ru.geekbrains.java1.lesson7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        long t1, t2;
        String someText = "Simple Java programm - Hello World"; // Создание строки и разбивка на токены
        String s = new String("Simple Java programm - Hello World");
        String someText2 = "Simple Java programm - Hello World"; // Создание строки и разбивка на токены

//        System.out.println(s.equals(someText2));
//        System.out.println(s==someText2);
//        System.out.println(s.equals(someText));
//        System.out.println(s==someText);
//        System.out.println(someText2.equals(someText));
//        System.out.println(someText2==someText);
//
//        someText2 = "grthrtdh" + 57 + "fgjgfhjgf";   // "57"
//        System.out.println(someText2);
//        System.out.println(someText);

//        String[] someTextTokens = someText.split(" ");
//        for (int i = 0; i < someTextTokens.length; i++) {
//            System.out.println(someTextTokens[i]);
//        }

//        System.out.println("rt" + someText  + "gtrhgh");
//        System.out.println(someText);
//        System.out.println(someText.length());
//        someText.replace('a', 'd');
//        someText.replace("aa", "dddd");
//        someText.replaceAll("a", "d");
//        s.contains("hj");
//        s.isEmpty();
//        s.charAt(1);
//        s = s.concat("ghghj");   //s + "ghghj";
//        s.indexOf("r");
//        s.endsWith("fdfgd");
//        s.substring(0,8);


//
        int justInt = 2;
        // =============== Сравнение скорости работы String и StringBuilder
//        final int TEST_COUNT = 15000;
//        t1 = System.currentTimeMillis();
//        String h = "Hello";
//        for (int i = 0; i < TEST_COUNT; i++) {
//            h += "1" + justInt + "2";
//            if (h.length() > 1800) h = "Hello";
//        }
//        t2 = System.currentTimeMillis();
//        System.out.println("String Time: " + (t2 - t1));
//
//        t1 = System.currentTimeMillis();
//        StringBuilder h2 = new StringBuilder("Hello");
//        for (int i = 0; i < TEST_COUNT; i++) {
//            h2.append("1");
//            h2.append(justInt);
//            h2.append("2");
//            if (h.length() > 1800) h2 = new StringBuilder("Hello");
//        }
//        t2 = System.currentTimeMillis();
//        System.out.println("StringBuilder Time: " + (t2 - t1));
//StringBuffer
        readFileTest();
        writeStringToFileTest(someText);
    }

    public static void readFileTest() {
        System.out.println("================ READ TEST ==================");
        int i;
        File file = new File("dir");
        file.isDirectory();
        file.getPath();
        String sep = File.pathSeparator;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("dir.txt");
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
            fin.close();
        } catch (IOException е) {
            System.out.println("Произошла ошибкa чтения файла");
        }
        System.out.println("==========================================");
    }

    public static void writeStringToFileTest(String text) {
        System.out.println("================ WRITE TEST =================");
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("out.txt");
            for (int i = 0; i < text.length(); i++) {
                fout.write(text.charAt(i));
            }
            if (fout != null) fout.close();
        } catch (IOException е) {
            System.out.println("Произошла ошибка при записи в файл");
        }
        System.out.println("=============================================");
    }


}
