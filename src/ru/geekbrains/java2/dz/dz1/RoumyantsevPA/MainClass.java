package ru.geekbrains.java2.dz.dz1.RoumyantsevPA;

public class MainClass {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Bob"), new Cat("Barsik"), new Dog("Bobik")};
        Obstacle[] course = {new Cross(300), new Wall(25), new Cross(400)};

        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) {
                    System.out.println(c.getName() + " OUT");
                    break;
                }
            }
        }

        System.out.println("Results:");
        for (Competitor c : competitors) {
            if (c.isOnDistance()) {
                System.out.println(c.getName() + " WIN");
            } else {
                System.out.println(c.getName() + " LOSE");
            }
        }
    }
}
