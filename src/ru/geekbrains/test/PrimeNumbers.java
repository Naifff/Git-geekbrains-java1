package ru.geekbrains.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import static java.io.FileDescriptor.in;

public class PrimeNumbers {
    static String thresd1;
    static String thresd2;
    static String thresd3;
    static String thresd4;

    public static void main(String[] args) {

      //  ArrayList<Long> primes = new ArrayList<Long>();
         BufferedWriter bw = null;
        BufferedReader br = null;
        long cur=0L;
        try {
            br = new BufferedReader(new FileReader(".\\src\\ru\\geekbrains\\test\\ex2.txt"));
            String str;
            str = br.readLine();

            String prim[] = str.split(" ");
//            for (int i = 0; i < prim.length; i++) {
//                primes.add(Long.valueOf(prim[i]));
//            }
            cur = Long.valueOf(prim[prim.length-1]);
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

            // primes.get(primes.size() - 1);


            thresd1="";

        long finalCur = cur;
        Thread t1=new Thread(() -> {
                long cur1 = finalCur;

                while (cur1 < cur1 + 500000) {
                    cur1 += 2;
                    boolean yep = true;
                    for (int i = 3; i < cur1 / 2; i += 2) {
                        if (cur1 % i == 0) {
                            yep = false;
                            break;
                        }
                    }
                    if (yep) {
                        thresd1 += cur1 + " ";
                    }
                }
            });
            t1.start();

            thresd2="";
            Thread t2=new Thread(() -> {
                long cur1 = finalCur + 500000;
                while (cur1 < cur1 + 500000) {
                    cur1 += 2;
                    boolean yep = true;
                    for (int i = 3; i < cur1 / 2; i += 2) {
                        if (cur1 % i == 0) {
                            yep = false;
                            break;
                        }
                    }
                    if (yep) {
                        thresd2 += cur1 + " ";
                    }
                }
            });
            t2.start();

            thresd3="";
            Thread t3=new Thread(() -> {
                long cur1 = finalCur + 1000000;
                while (cur1 < cur1 + 500000) {
                    cur1 += 2;
                    boolean yep = true;
                    for (int i = 3; i < cur1 / 2; i += 2) {
                        if (cur1 % i == 0) {
                            yep = false;
                            break;
                        }
                    }
                    if (yep) {
                        thresd3 += cur1 + " ";
                    }
                }
            });
            t3.start();
            thresd4="";
           Thread t4= new Thread(() -> {
                long cur1 = finalCur + 1500000;
                while (cur1 < cur1 + 500000) {
                    cur1 += 2;
                    boolean yep = true;
                    for (int i = 3; i < cur1 / 2; i += 2) {
                        if (cur1 % i == 0) {
                            yep = false;
                            break;
                        }
                    }
                    if (yep) {
                        thresd4 += cur1 + " ";
                    }
                }
            });
           t4.start();

        try {
            bw = new BufferedWriter(new FileWriter(".\\src\\ru\\geekbrains\\test\\ex2.txt", true));

            t1.join();
            bw.write(thresd1);
            t2.join();
            bw.write(thresd2);
            t3.join();
            bw.write(thresd3);
            t4.join();
            bw.write(thresd4);
            bw.close();
        } catch (InterruptedException e ) {
            e.printStackTrace();
        }catch ( IOException e){
            e.printStackTrace();
        }


//            long t1 = System.currentTimeMillis();
//            String outBuff="";
//            while (System.currentTimeMillis() - t1 < 300000) {
//                cur += 2;
//                boolean yep = true;
//                for (int i = 3; i < cur / 2; i += 2) {
//                    if (cur % i == 0) {
//                        yep = false;
//                        break;
//                    }
//                }
//                if (yep) {
////                    primes.add(cur);
////                    System.out.print(cur + ",");
//                    outBuff+=cur+" ";
//                    //bw.write(cur + " ");
//                }
//            }
//            bw = new BufferedWriter(new FileWriter(".\\src\\ru\\geekbrains\\test\\ex2.txt", true));
//            bw.write(outBuff);
//            bw.close();



    }
}
