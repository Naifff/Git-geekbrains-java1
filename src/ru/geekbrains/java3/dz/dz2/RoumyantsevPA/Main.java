package ru.geekbrains.java3.dz.dz2.RoumyantsevPA;

/*
1. Сформировать таблицу товаров (id, prodid, title, cost) запросом из Java приложения.
id - порядковый номер записи, первичный ключ
prodid - уникальный номер товара
title - название товара
cost - стоимость

2. При запуске приложения очистить таблицу и заполнить 10.000 товаров вида:
id_товара 1 товар1 10
id_товара 2 товар2 20
id_товара 3 товар3 30
…
id_товара 10000 товар10000 100000

3. Написать консольное приложение, которое позволяет узнать цену товара по его имени, либо вывести сообщение "Такого
товара нет" если товара не в базе. Консольная команда: "/цена товар545"
4. Добавить возможность изменения цены товара (указываем имя товара и новую цену). Консольная команда: "/сменитьцену
 товар10 10000"
5. Вывести товары в заданном ценовом диапазоне. Консольная команда: "/товарыпоцене 100 600"
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String db="dz2";
        String col2="prodid";
        String col3="title";
        String col4="cost";
        String prod="товар";
        SQLHandler sqlHandler = new SQLHandler();
        try {
            sqlHandler.connect();
            sqlHandler.myExecuteUpdate("DROP TABLE IF EXISTS "+db);
            sqlHandler.myExecuteUpdate("CREATE TABLE IF NOT EXISTS "+db+" (    id     INTEGER PRIMARY KEY,    "+col2+" INTEGER UNIQUE,    "+col3+"  TEXT    NIQUE,    "+col4+"   DOUBLE );");
            sqlHandler.autoCommitOff();
            for(int i=1;i<10001;i++){
                sqlHandler.myExecuteUpdate("INSERT INTO "+db+" ("+col2+", "+col3+", "+col4+") VALUES ("+i+",'"+prod+i+"', "+(i*10)+");");
            }
sqlHandler.autoCommitOn();
            Scanner sc=new Scanner(System.in);
            System.out.println("Доступные команды: \n/цена товар545\n/сменитьцену товар10 10000\n/товарыпоцене 100 600");
            String in=sc.nextLine();
            if(in.startsWith("/цена")){
                String[] rq=in.split(" ");
               ResultSet rs= sqlHandler.mySelect("SELECT "+col3+" FROM "+db+" WHERE "+col4+" VALUE ( "+rq[1]+");");
               if(rs.next()){
                   System.out.println(rs.getInt(col4));
               }else{
                   System.out.println("Такого товара нет");
               }
               System.out.println(rs);

            }
            if(in.startsWith("/сменитьцену")){

            }
            if(in.startsWith("/товарыпоцене")){

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            sqlHandler.disconnect();
        }

    }


}
//        ResultSet rs = stmt.executeQuery("SELECT * FROM students;");
//        while (rs.next()) {
//            System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " + rs.getInt(3));
//        }