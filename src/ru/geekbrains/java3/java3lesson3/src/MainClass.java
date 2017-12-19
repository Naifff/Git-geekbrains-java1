package ru.geekbrains.java3.java3lesson3.src;


import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {
        Student student = new Student(1, "Bob1");
        Student student2 = new Student(1, "Bob2");
        Book book = new Book("Jungle Book");
        student.book = book;
        student2.book = book;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stud.ser"))) {
            oos.writeObject(student);
            oos.reset();
            book.title = "Jungle Book Part II";
            oos.writeObject(student2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stud.ser"))) {
            Student studentFromFile1 = (Student) ois.readObject();
            Student studentFromFile2 = (Student) ois.readObject();
            studentFromFile1.info();
            studentFromFile2.info();
            System.out.println(studentFromFile1.book.title);
            System.out.println(studentFromFile2.book.title);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void randomAccessFileEx() {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("1.txt", "rw");
            raf.seek(1000);
            raf.seek(200);
            raf.write(10);
            raf.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                raf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void sequenceInputEx() {
        SequenceInputStream in = null;
        try {
            in = new SequenceInputStream(Collections.enumeration(new ArrayList<InputStream>(Arrays.asList(
                    new FileInputStream("1.txt"),
                    new FileInputStream("2.txt"),
                    new FileInputStream("3.txt"),
                    new FileInputStream("4.txt")
            ))));
            int x;
            while ((x = in.read()) != -1) {
                System.out.println((char) x);
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

    private static void inputStreamReaderEx() {
        try (InputStreamReader in = new InputStreamReader(new FileInputStream("rus.txt"), "UTF-8");) {
            int x;
            while ((x = in.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileWithByteArrayEx() {
        try (FileInputStream in = new FileInputStream("1.txt");) {
            byte[] arr = new byte[4];
            int n;
            while ((n = in.read(arr)) > 0) {
                System.out.print(new String(arr, 0, n));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void simpleReadEx() {
        try (FileInputStream in = new FileInputStream("out.txt");) {
            long t = System.currentTimeMillis();
            int x;
            while ((x = in.read()) != -1) {
                System.out.print((char) x);
            }
            System.out.println(System.currentTimeMillis() - t);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void optimizedArrayOutToFile() {
        try (FileOutputStream out = new FileOutputStream("out.txt");) {
            long t = System.currentTimeMillis();
            byte[] arr = new byte[1024];
            for (int i = 0; i < 1024; i++) {
                arr[i] = 65;
            }
            for (int i = 0; i < 1024 * 5; i++) {
                out.write(arr);
            }
            System.out.println(System.currentTimeMillis() - t);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void simpleFileOutEx() {
        try (FileOutputStream out = new FileOutputStream("out.txt");) {
            long t = System.currentTimeMillis();
            for (int i = 0; i < 1024 * 1024 * 5; i++) {
                out.write(65);
            }
            System.out.println(System.currentTimeMillis() - t);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void standartOutEx() {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("out.txt");
            // ...
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void fileFiltersEx() {
        File file = new File("123");
        System.out.println(file.getAbsolutePath());
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.length() > 1;
            }
        });
        for (File o : files) {
            System.out.println(o);
        }
    }
}
