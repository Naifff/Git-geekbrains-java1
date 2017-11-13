package ru.geekbrains.java2.dz.dz1.RoumyantsevPA;

import java.util.Random;

public class Course {
    // Random rnd=new Random();
    Obstacle[] barriers;

    public Course() {
        Random rnd = new Random();
        this.barriers = new Obstacle[(rnd.nextInt(5) + 4)];
        System.out.println((this.barriers.length));
        for (Obstacle barrier : barriers
                ) {

            switch (rnd.nextInt(3)) {
                case 0:
                    barrier = new Cross(rnd.nextInt(500) + 500);
                    break;
                case 1:
                    barrier = new Wall(rnd.nextInt(2) + 1);
                    break;
                default:
                    barrier = new Water(rnd.nextInt(200) + 200);
            }


        }

    }

    public void doIt(Team t){
        for (Competitor member:t.members
             ) {
            for (Obstacle barrier:this.barriers
                 ) {
                barrier.doIt((member));
                if (!member.isOnDistance()){
                    break;
                }

            }

        }

    }


}
