package ru.geekbrains.java2.dz.dz1.RoumyantsevPA;

public class Team {
    private final static int CAPACITY =4;
    String title="";
    Competitor[] members=  new  Competitor[CAPACITY];
    public void doneAll(){
        for (Competitor member:this.members) {
            if(member.isOnDistance()){
                System.out.println(member.getName()+": прошел.");
            }else {
                System.out.println(member.getName()+": не прошел.");
            }

        }

    }

    public void done(){
        for (Competitor member:this.members) {
            if(member.isOnDistance()){
                System.out.println(member.getName()+": прошел.");
            }
            }

        }


}
