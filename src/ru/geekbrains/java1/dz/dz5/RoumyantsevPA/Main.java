package ru.geekbrains.java1.dz.dz5.RoumyantsevPA;

public class Main {
    public static void main(String[] args) {
        Human[] humans=new Human[50];
        int count   =0;
        for(Human   human: humans){
            human = new Human();
            if(human.getAge()>40&&count<10&&human.getPaycheck()>50000){
                human.printHuman();
                System.out.println();
                count++;
            }
        }

//        for (int i=0;i<humanArr.length;i++){
//            humanArr[i]= new Human();
//            if (humanArr[i].above40()&&count<10){
//                humanArr[i].printHuman();
//                System.out.println();
//                count++;
//            }
//        }


    }
}
