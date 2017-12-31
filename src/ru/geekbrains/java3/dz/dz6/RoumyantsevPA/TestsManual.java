package ru.geekbrains.java3.dz.dz6.RoumyantsevPA;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.*;

import java.sql.*;
import java.util.Arrays;

public class TestsManual {
    Dz dz;
    Connection connection;
    Statement stmt;
    PreparedStatement ps;


    @Test
    public void testT1_1() {
        Assert.assertEquals(Arrays.toString(new int[]{1, 7}), Arrays.toString(dz.task1(1, 2, 4, 4, 2, 3, 4, 1, 7)));
    }

    @Test
    public void testT1_2() {
        Assert.assertEquals(Arrays.toString(new int[]{}), Arrays.toString(dz.task1(1, 2, 4, 4, 2, 3, 4, 1, 7, 4)));
    }

    @Test
    public void testT1_3() {
        Assert.assertEquals(Arrays.toString(new int[]{99, 2, 3, 99, 1, 7}), Arrays.toString(dz.task1(1, 2, 99, 4, 99, 2, 3, 99, 1, 7)));
    }

    @Test
    public void testT1_4() {
        Assert.assertEquals(Arrays.toString(new int[]{2, 3, 11, 1, 7}), Arrays.toString(dz.task1(1, 2, 4, 4, 2, 3, 11, 1, 7)));
    }

    @Test
    public void testT1_5() {
        Assert.assertEquals(Arrays.toString(new int[]{1, 2, 3, 22, 1, 7}), Arrays.toString(dz.task1(1, 2, 4, 1, 2, 3, 22, 1, 7)));
    }

    @Test(expected = RuntimeException.class)
    public void testT1_No4() {
        dz.task1(1, 2, 99, 99, 2, 3, 99, 1, 7);
    }

//    @Test(timeout = 500)
//    public void test5() {
////        try {
////            Thread.sleep(501);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        System.out.println(1);
//    }

//    @Test
//    @Ignore("Сейчас мне этот тест не нужен")
//    public void testT1_6() {
//        System.out.println(6);
//    }

    @Before
    public void init() throws Exception {
        dz = new Dz();
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:.\\src\\ru\\geekbrains\\java3\\dz\\dz6\\RoumyantsevPA\\data.db");
        stmt = connection.createStatement();
    }

    @After
    public void shutdown() throws Exception {
        //  stmt.executeUpdate("DELETE FROM students WHERE name ='TestUser';");
        connection.close();
//        System.out.println("End test...");
    }

    @Test
    public void testT2_1() {
        Assert.assertEquals(false, dz.task2(1, 1, 1, 1, 1, 1, 1));
    }

    @Test
    public void testT2_2() {
        Assert.assertEquals(true, dz.task2(4, 1, 1, 1, 1, 1, 4));
    }

    @Test
    public void testT2_3() {
        Assert.assertEquals(false, dz.task2(4, 1, 3, 1, 1, 1, 4));
    }

    @Test
    public void testT2_4() {
        Assert.assertEquals(true, dz.task2(4, 1, 4, 1, 4, 1, 4));
    }

    @Test
    public void testT3_read() throws Exception {
        ResultSet rs = stmt.executeQuery("SELECT * FROM students;");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " + rs.getInt(2));
        }
    }

//    @Test
//    public void testT3_write() throws Exception {
//        stmt.executeUpdate("INSERT INTO students (id, point , name) VALUES (-1," + 0 + ",'" + "TestUser" + "');");
//    }

//    @Test
//    public void testT3_update() throws Exception {
//        stmt.executeUpdate("UPDATE students SET point = 777 WHERE name ='TestUser';");
//    }

    //    @Test
//    public void testT3_delete() throws Exception {
//        stmt.executeUpdate("DELETE FROM students WHERE name ='TestUser';");
//    }
    @Test
    public void testT3_SQL() throws Exception {
        System.out.println("создаем тестового пользователя");
        stmt.executeUpdate("INSERT INTO students (id, point , name) VALUES (-1,0,'TestUser');");
        System.out.println("обновляем данные");
        stmt.executeUpdate("UPDATE students SET point = 777 WHERE name ='TestUser';");
        System.out.println("удаляем тестового пользователя");
        stmt.executeUpdate("DELETE FROM students WHERE name ='TestUser';");
    }

}
