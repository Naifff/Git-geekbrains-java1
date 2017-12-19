package ru.geekbrains.java3.dz.dz3.RoumyantsevPA;

/*
1. Прочитать файл (около 50 байт) в байтовый массив и вывести этот массив в консоль;
2. Последовательно сшить 5 файлов в один (файлы также ~100 байт).
Может пригодиться следующая конструкция:
ArrayList<InputStream> al = new ArrayList<>();
...
Enumeration<InputStream> e = Collections.enumeration(al);

3. Написать консольное приложение, которое умеет постранично читать текстовые файлы (размером > 10 mb), вводим страницу,
 программа выводит ее в консоль (за страницу можно принять 1800 символов). Время чтения файла должно находится в
 разумных пределах (программа не должна загружаться дольше 10 секунд), ну и чтение тоже не должно занимать >5 секунд.
Чтобы не было проблем с кодировкой используйте латинские буквы.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String filename = ".\\src\\ru\\geekbrains\\java3\\dz\\dz3\\RoumyantsevPA\\ex1.txt";
        int size = 50;
        String path = ".\\src\\ru\\geekbrains\\java3\\dz\\dz3\\RoumyantsevPA\\";
        optimizedArrayOutToFile(50, filename);
        readFileWithByteArrayEx(50, filename);
        sequenceInputEx(5,100,path);


    }

    private static void optimizedArrayOutToFile(int size, String filename) {
        long t = System.currentTimeMillis();
        Random rnd = new Random();
        try (FileOutputStream out = new FileOutputStream(filename);) {

            byte[] arr = new byte[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (byte) ((byte) rnd.nextInt() * 254);
            }
//            for (int i = 0; i < 1024 * 5; i++) {
            out.write(arr);
//            }
            System.out.println("время гененации файла:" + (System.currentTimeMillis() - t) + "мс.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileWithByteArrayEx(int size, String filename) {
        long t = System.currentTimeMillis();
        try (FileInputStream in = new FileInputStream(filename);) {
            byte[] arr = new byte[size];
            int n;
            while ((n = in.read(arr)) > 0) {
                System.out.print(new String(arr, 0, n));
            }
            System.out.println();
            System.out.println("время чтения из файла:" + (System.currentTimeMillis() - t) + "мс.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sequenceInputEx(int files, int size, String path) {
        SequenceInputStream in = null;
        try {
//            in = new SequenceInputStream(Collections.enumeration(new ArrayList<InputStream>(Arrays.asList(
//                    new FileInputStream("1.txt"),
//                    new FileInputStream("2.txt"),
//                    new FileInputStream("3.txt"),
//                    new FileInputStream("4.txt")
//            ))));
            ArrayList<InputStream> ipsarr = new ArrayList<>();

            for (int i = 0; i < files; i++) {
                optimizedArrayOutToFile(size, path + "Ex2" + i + ".txt");
                ipsarr.add(new FileInputStream(path + "Ex2" + i + ".txt"));
            }
            in = new SequenceInputStream(Collections.enumeration(ipsarr));

            try (FileOutputStream out = new FileOutputStream(path + "Ex2" + "_result" + ".txt");) {
                byte[] arr = new byte[size];
                int x;
                int i = 0;
                while ((x = in.read()) != -1) {
                    if (i > size) {
                        i = 0;
                        out.write(arr);
                    }
                    System.out.println(i);
                    arr[i] = (byte) x;
                    i++;
                }
                out.write(arr);


            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
