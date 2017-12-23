package ru.geekbrains.java3.dz.dz4.RoumyantsevPA;

/*
1. Создать три потока, каждый из которых выводит определенную букву (A, B и C) 5 раз, порядок должен быть именно
ABСABСABС. Используйте wait/notify/notifyAll.
2. Написать совсем небольшой метод, в котором 3 потока построчно пишут данные в файл (штук по 10 записей, с периодом
в 20 мс)
3. Написать класс МФУ, на котором возможны одновременная печать и сканирование документов, при этом нельзя одновременно
печатать два документа или сканировать (при печати в консоль выводится сообщения "отпечатано 1, 2, 3,... страницы", при
сканировании тоже самое только "отсканировано...", вывод в консоль все также с периодом в 50 мс.)
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    static char cl = 'A';
    static Object mon = new Object();
    final static Object mon2 = new Object();
    static boolean ex2Done = false;
    static MFU mfu = new MFU();

    public static void main(String[] args) {
        ExecutorService serv = Executors.newFixedThreadPool(3);
        serv.execute(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (cl != 'A') {
                            mon.wait();
                        }
                        System.out.print('A');
                        cl = 'B';
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        serv.execute(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (cl != 'B') {
                            mon.wait();
                        }
                        System.out.print('B');
                        cl = 'C';
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        serv.execute(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (cl != 'C') {
                            mon.wait();
                        }
                        System.out.print('C');
                        cl = 'A';
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        ex2();
        serv.shutdown();

        new Thread(() -> {
            mfu.print(4, 1);
            mfu.print(66, 1);
            mfu.print(1, 1);
            mfu.scan(10, 1);
        }).start();

        new Thread(() -> {
            mfu.scan(10, 2);
            mfu.scan(4, 2);
            mfu.print(5, 2);
            mfu.scan(6, 2);
        }).start();

    }

    public static void ex2() {

        try {
            FileOutputStream out = new FileOutputStream(".\\src\\ru\\geekbrains\\java3\\dz\\dz4\\RoumyantsevPA\\ex2.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            try (FileOutputStream out = new FileOutputStream(".\\src\\ru\\geekbrains\\java3\\dz\\dz4\\RoumyantsevPA\\ex2.txt", true);) {
                byte[] arr = new byte[30];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (byte) 'A';
                }
                arr[arr.length - 1] = (byte) '\n';

                for (int i = 0; i < 10; i++) {
                    synchronized (mon2) {
                        out.write(arr);
                        try {
                            mon2.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try (FileOutputStream out = new FileOutputStream(".\\src\\ru\\geekbrains\\java3\\dz\\dz4\\RoumyantsevPA\\ex2.txt", true);) {
                byte[] arr = new byte[30];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (byte) 'B';
                }
                arr[arr.length - 1] = (byte) '\n';

                for (int i = 0; i < 10; i++) {
                    synchronized (mon2) {
                        out.write(arr);
                        try {
                            mon2.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try (FileOutputStream out = new FileOutputStream(".\\src\\ru\\geekbrains\\java3\\dz\\dz4\\RoumyantsevPA\\ex2.txt", true);) {
                byte[] arr = new byte[30];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (byte) 'C';
                }
                arr[arr.length - 1] = (byte) '\n';

                for (int i = 0; i < 10; i++) {
                    synchronized (mon2) {
                        out.write(arr);
                        try {
                            mon2.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (mon2) {
                    mon2.notifyAll();
                }
            }
        }).start();

    }

}

class MFU {
    private Object print = new Object();
    private Object scan = new Object();
    private int printCount = 0;
    private int scanCount = 0;

    public void print(int i, int nom) {
        synchronized (print) {
            printCount = 0;
            for (int j = 0; j < i; j++) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                printCount++;
                System.out.println(nom + "Напечатано: " + printCount);
            }
        }
    }

    public void scan(int i, int nom) {
        synchronized (scan) {
            scanCount = 0;
            for (int j = 0; j < i; j++) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                scanCount++;
                System.out.println(nom + "Отсканировано: " + scanCount);
            }
        }
    }
}