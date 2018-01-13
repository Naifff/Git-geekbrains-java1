package ru.geekbrains.java3.dz.dz7.RoumyantsevPA;

public class TestMe {
    @BeforeSuite
    public static void firstTest(){
        System.out.println("Первый тест");
    }

    @Test(priority = 1)
    public static void p1Test(){
        System.out.println("Первый по приоритету тест");
    }

    @Test(priority = 2)
    public static void p2p2Test(){
        System.out.println("Второй приоритет.2");
    }

    @Test(priority = 2)
    public static void p2p1Test(){
        System.out.println("Второй приоритет.1");
    }

    @Test
    public static void Test(){
        System.out.println("Тест с дефолтным приоритетом");
    }

    @Test(priority = 10)
    public static void p10Test(){
        System.out.println("Последний по приоритету тест");
    }

    @Test(priority = -100)
    public static void pNinusStoTest(){
        System.out.println("-100 по приоритету тест");
    }

    @AfterSuite
    public static void lastTest(){ System.out.println("Последний тест");
    }
}
