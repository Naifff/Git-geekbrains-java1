package ru.geekbrains.java3.dz.dz2.RoumyantsevPA;

import java.sql.*;

public class SQLHandler {
    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement ps;

//    public static void main(String[] args) {
//        try {
//            //connect();
//            dropTableEx();
//            createTableEx();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//// catch (ClassNotFoundException e) {
////            e.printStackTrace();
////        }
// finally {
//            disconnect();
//        }
//    }

    private static void rollbackEx() throws SQLException {
        stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob1', 10);");
        Savepoint sp = connection.setSavepoint();
        stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob2', 20);");
        connection.rollback(sp);
        stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob3', 10);");
        connection.setAutoCommit(true);
    }

    public void autoCommitOff() {
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void autoCommitOn() {
        try {
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void preparedStatementAndBatchEx() throws SQLException {
        connection.setAutoCommit(false);
        ps = connection.prepareStatement("INSERT INTO students (name, score) VALUES (?, ?);");
        for (int i = 1; i <= 2000; i++) {
            ps.setString(1, "Bob" + i);
            ps.setInt(2, (i * 10) % 100);
            ps.addBatch();
        }
        ps.executeBatch();
        connection.setAutoCommit(true);
    }

    private static void transactionEx() throws SQLException {
        long t = System.currentTimeMillis();
        connection.setAutoCommit(false);
        for (int i = 1; i <= 1000; i++) {
            stmt.executeUpdate(String.format("INSERT INTO students (name, score) VALUES ('%s', %d);", "Bob" + i, (i * 10) % 100));
        }
        connection.setAutoCommit(true);
        System.out.println(System.currentTimeMillis() - t);
    }

    public void createTableEx() throws SQLException {
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, score INTEGER);");
        // stmt.executeUpdate("CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, score INTEGER);");
    }
//    public void createTableEx(String request) throws SQLException {
//        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+request+";");
//        // stmt.executeUpdate("CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, score INTEGER);");
//    }


    public void dropTableEx() throws SQLException {
        stmt.executeUpdate("DROP TABLE IF EXISTS students");
    }

    private static void clearEx() throws SQLException {
        stmt.executeUpdate("DELETE FROM students;");
    }

    private static void deleteEx() throws SQLException {
        stmt.executeUpdate("DELETE FROM students WHERE id < 3;");
    }

    private static void updateEx() throws SQLException {
        stmt.executeUpdate("UPDATE students SET score = 100 WHERE id < 3;");
    }

    private static void insertEx() throws SQLException {
        stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob4', 40);");
    }

    private static void selectEx() throws SQLException {
        ResultSet rs = stmt.executeQuery("SELECT * FROM students;");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " + rs.getInt(3));
        }
    }

    public void connect() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:.\\src\\ru\\geekbrains\\java3\\dz\\dz2\\RoumyantsevPA\\data.db");
        stmt = connection.createStatement();
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int myExecuteUpdate(String request) throws SQLException {
        return stmt.executeUpdate(request);
    }

    public ResultSet mySelect(String request) throws SQLException {
        return stmt.executeQuery(request);
    }
}
