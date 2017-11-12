package ru.geekbrains.java1.dz.dz7.RoumyantsevPA;

import java.io.*;
import java.util.Random;

public class CatNames {
    static Random rnd =new Random();
    static String [] catNames = {"cat","cat1"};
  //  public static String catName(){
  //      return catNames[rnd.nextInt(catNames.length)];
   // }


    public static void readFileTest() {
        String h1="";
        System.out.println("================ READ TEST ==================");
        int i;
     //   File file = new File(".\\src\\ru\\geekbrains\\java1\\dz\\dz7\\RoumyantsevPA\\names2.txt");
     //   System.out.println(file.isDirectory()+"    "+file.getPath())  ;

      //  String sep = File.pathSeparator;
        FileInputStream fin = null;
      //  FileInputStream fin2 = null;
        StringBuilder h2 = new StringBuilder("");
        try {
            fin = new FileInputStream(".\\src\\ru\\geekbrains\\java1\\dz\\dz7\\RoumyantsevPA\\names2.txt");


           // String[] someTextTokens = someText.split(" ");
            do {
                i = fin.read();
                if (i != -1) h2.append((char)i);
            } while (i != -1);
            fin.close();
        } catch (IOException е) {
            System.out.println("Произошла ошибкa чтения файла");
        }
        String[] someTextTokens = h2.toString().split(",");
        System.out.println("==========================================");
        System.out.println(someTextTokens[0]);

//        try {
//            h1 = read(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println(h1);

        File file = new File(".\\src\\ru\\geekbrains\\java1\\dz\\dz7\\RoumyantsevPA\\names2.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));
            try {
                String line=bufferedReader.readLine();
                System.out.println(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(bufferedReader);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }

    public static void main(String[] args) {
        readFileTest();
    }


        public static String read(File file) throws FileNotFoundException
        { BufferedInputStream reader = new BufferedInputStream(new FileInputStream( file ) );
        StringBuilder stringBuilder = new StringBuilder();
        try {
            if( reader.available() > 0 )
            {
                stringBuilder.append( (char)reader.read() );
            }
        } catch (IOException ex)
        { System.err.println(ex.toString()); }
        return(stringBuilder.toString()); }

}