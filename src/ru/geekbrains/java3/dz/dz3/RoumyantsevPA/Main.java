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
import java.util.*;

public class Main {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        String filename = ".\\src\\ru\\geekbrains\\java3\\dz\\dz3\\RoumyantsevPA\\ex1.txt";
        int size = 50;
        String path = ".\\src\\ru\\geekbrains\\java3\\dz\\dz3\\RoumyantsevPA\\";
        fileCreator(50, filename);
        fileReader(filename);
        merge(5, 100, path);
        System.out.println("1 и 2 задание" + (System.currentTimeMillis() - t) + "мс.");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите номер страницы:");
        int l = sc.nextInt();
        t = System.currentTimeMillis();
        readList(l,path);
        System.out.println("3 задание" + (System.currentTimeMillis() - t) + "мс.");

    }

    private static void fileCreator(int size, String filename) {
        long t = System.currentTimeMillis();
        Random rnd = new Random();
        try (FileOutputStream out = new FileOutputStream(filename);) {

            byte[] arr = new byte[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (byte) randLetter();
            }
            out.write(arr);
            System.out.println("время гененации файла:" + (System.currentTimeMillis() - t) + "мс.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileReader(String filename) {
        long t = System.currentTimeMillis();
        try (FileInputStream in = new FileInputStream(filename);) {
            byte[] arr = new byte[50];
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

    private static void merge(int files, int size, String path) {
        System.out.println();

        SequenceInputStream in = null;
        try {
            ArrayList<InputStream> ipsarr = new ArrayList<>();

            for (int i = 0; i < files; i++) {
                fileCreator(size, path + "Ex2" + i + ".txt");
                ipsarr.add(new FileInputStream(path + "Ex2" + i + ".txt"));
            }
            in = new SequenceInputStream(Collections.enumeration(ipsarr));

            try (FileOutputStream out = new FileOutputStream(path + "Ex2" + "_result" + ".txt");) {
                byte[] arr = new byte[size];
                int x;
                int i = 0;
                long t = System.currentTimeMillis();
                while ((x = in.read()) != -1) {
                    if (i >= size) {
                        i = 0;
                        out.write(arr);
                    }
                    // System.out.println(i);
                    arr[i] = (byte) x;
                    i++;
                }
                out.write(arr);

                System.out.println("время склейки " + files + " файлов по " + size + " байт:" + (System.currentTimeMillis() - t) + "мс.");
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

    private static void readList(int l, String path) {
        long t = System.currentTimeMillis();
        try (FileOutputStream out = new FileOutputStream(path+"BIG.txt");) {

            byte[] arr = new byte[1024];
            for (int i = 0; i < 1024; i++) {

                arr[i] = (byte) randLetter();
            }
            for (int i = 0; i < 1024 * 10; i++) {
                out.write(arr);
            }
            System.out.println("время гененации файла в 10MB: " + (System.currentTimeMillis() - t) + "мс.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        t = System.currentTimeMillis();
        try (RandomAccessFile raf = new RandomAccessFile(path+"BIG.txt", "r")) {
            int start = l * 1800;
            char[] arr = new char[1800];
            for (int i = start; i < start + 1800; i++) {
                raf.seek(l * 1800 + i);
                arr[i - start] = (char) raf.read();
            }
            System.out.println("чтение страницы: " + (System.currentTimeMillis() - t) + "мс.");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            System.out.println("вывод в консоль " + (System.currentTimeMillis() - t) + "мс.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static char randLetter() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ,.!?";
        Random rnd = new Random();
        return str.charAt(rnd.nextInt(str.length()));

    }
}
