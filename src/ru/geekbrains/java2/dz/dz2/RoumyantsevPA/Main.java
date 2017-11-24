package ru.geekbrains.java2.dz.dz2.RoumyantsevPA;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        String[][] fXf = new String[4][4];
        for (int i = 0; i < fXf.length; i++) {
            for (int j = 0; j < fXf[0].length; j++) {
                fXf[i][j] = "" + rnd.nextInt(100);
            }
        }
        //fXf[0][0] = null;
        //fXf[0][0]="n";
        int result;
        try {
            result = myMethod(fXf);
            System.out.println("\n Count: " + result);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MySizeArrayException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < fXf.length; i++) {
            System.out.println(Arrays.toString(fXf[i]));
        }
    }

    private static int myMethod(String[][] fourXfour) {
        if (fourXfour.length == 4 && fourXfour[0].length == 4) {
            //  System.out.println("GJ");
            int count = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (testStr2Int(fourXfour[i][j])) {
                        count += Integer.parseInt(fourXfour[i][j]);
                    } else {
                        throw new MyArrayDataException("Ошибка в элементе: [" + i + "][" + j + "] = " + fourXfour[i][j]);
                    }
                }
            }
            return count;
        } else {
            throw new MySizeArrayException("Матрица не соответствует размеру 4х4");
        }
    }

    private static boolean testStr2Int(String s) {
        if (s == null) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '1':
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '4':
                    break;
                case '5':
                    break;
                case '6':
                    break;
                case '7':
                    break;
                case '8':
                    break;
                case '9':
                    break;
                case '0':
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
