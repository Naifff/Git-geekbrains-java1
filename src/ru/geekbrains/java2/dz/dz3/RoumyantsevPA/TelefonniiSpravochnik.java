package ru.geekbrains.java2.dz.dz3.RoumyantsevPA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelefonniiSpravochnik {
    private Map<String, ArrayList<Long>> tsp = new HashMap<String, ArrayList<Long>>();

    public void add(String fio, long tel) {
        ArrayList<Long> tell = new ArrayList<Long>();
        if (this.tsp.containsKey(fio)) {
            tell = this.tsp.get(fio);
            tell.add(tel);
            this.tsp.put(fio, tell);
        } else {
            tell.add(tel);
            this.tsp.put(fio, tell);
        }

    }

    public void get(long tell) {
        int i = 0;
        for (String f : this.tsp.keySet()) {
            for (int j = 0; j < this.tsp.get(f).size(); j++) {
                if ((this.tsp.get(f).get(j) == tell)) {
                    System.out.println(f + ": " + tell);
                    i++;
                }
            }
        }
        if (i == 0) {
            System.out.println("Совпадений не найдено");
        }
    }

    public void get(String fioo) {
        if (this.tsp.containsKey(fioo)) {
            System.out.println(fioo + ": " + this.tsp.get(fioo));
        } else {
            System.out.println("Совпадений не найдено");
        }
    }

    public TelefonniiSpravochnik() {
    }
}

