package ru.geekbrains.java1.dz.dz7.RoumyantsevPA;

import java.io.*;
import java.util.Random;

public class CatNames {

    static Random rnd =new Random();
    static String [] catNames = {"cat","cat1"};
   // public static String catName(){
   //     return catNames[rnd.nextInt(catNames.length)];
   // }
// в файле с именами 12к имен котов.
   public static String  readNames() throws IOException {
    File file = new File(".\\src\\ru\\geekbrains\\java1\\dz\\dz7\\RoumyantsevPA\\names.txt");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));

            String[] line=bufferedReader.readLine().split(",");
          //  System.out.println(line[0]);
            bufferedReader.close();
            return line[rnd.nextInt(line.length)];

    }

    public static void main(String[] args) {
        try {
            readNames();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
