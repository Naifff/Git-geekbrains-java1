package ru.geekbrains.java2.dz.dz3.RoumyantsevPA;

import java.io.*;
import java.util.*;

/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
 из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        //в качестве текста использовалась Песнь первая Руслана и Людмилы )
        arrayList = readText();
        Set<String> set = new HashSet<String>();
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        for (String a : arrayList
                ) {
            set.add(a);
            if (hashMap.containsKey(a)) {
                int count;
                count = hashMap.get(a) + 1;
                hashMap.put(a, count);
            } else {
                hashMap.put(a, 1);
            }
        }
//        for (String i : cde.keySet()
//                ) {
//            if (cde.get(i) > 10) {
//                System.out.println(i + ":" + cde.get(i));
//            }
//
//          ты:11
//          руслан:11
//          в:58
//          и:87
//          с:35
//          я:40
//          за:12
//          на:19
//          не:39
//          но:27
//          он:19
//        }
//        System.out.println();

        System.out.println("Уникальных слов: " + set.size() + "\n" + set);
        System.out.println(hashMap);
    }


    public static ArrayList<String> readText() {
        File file = new File(".\\src\\ru\\geekbrains\\java2\\dz\\dz3\\RoumyantsevPA\\text.txt");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] line = new String[0];
        try {
            line = bufferedReader.readLine().split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ArrayList<String> out = new ArrayList<String>();
        for (String l : line
                ) {
            out.add(l);
        }
        return out;
    }

}
