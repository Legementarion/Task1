package com.example.math.DataBase;

import java.sql.*;

/**
 * Class for db connection and edit information
 * @author Lego on 12.02.2016.
 * @version 1.2
 */
public class Ships_db {

    /**   value save result of query from db   */
    public static ResultSet resSet;

    /** statement for db connection     */
    public Connection connect = null;

    /** statement for executing query      */
    public Statement stmt = null;

    /**  create connection with db by default     */
    Ships_db(){
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        try {
            connect = DriverManager.getConnection("jdbc:sqlite://C:\\Users\\Lego\\Desktop\\SQLiteStudio\\test.db");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        System.out.println("Connection successful");
    }

    /**
     * Create new database
     * @param name - name of new database
     */
    public void createDB(String name){
        try {
            connect = DriverManager.getConnection("jdbc:sqlite://C:\\Users\\Lego\\Desktop\\SQLiteStudio\\"+name+".db");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        System.out.println("Data Base " + name + " was created");
    }

    /**
     * create table with colomn and type of them
     */
    public void createTable(){
        try {
            stmt = connect.createStatement();
            stmt.execute("CREATE TABLE if not exists 'Classes' ('class' varchar[50] PRIMARY KEY, 'type' varchar[2], 'country' varchar[20], 'numGuns' integer, 'bore' real, 'displacement' integer);");
            stmt.execute("CREATE TABLE if not exists 'Ships' ('name' varchar[50] PRIMARY KEY, 'class' varchar[50], 'launched' integer );");
            stmt.execute("CREATE TABLE if not exists 'Battles' ('name' varchar[20] PRIMARY KEY, 'date' date);");
            stmt.execute("CREATE TABLE if not exists 'Outcomes' ( 'ship' varchar[50], 'battle' varchar[20], 'result' varchar[10], PRIMARY KEY('ship', 'battle'));");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Table created successful");

    }

    /**
     * method of inserting date in to table
     */
    public void insertIntoTable(){
        try {
            //insert in to Classes
                    stmt.execute("INSERT INTO Classes('class', 'type', 'country', 'numGuns', 'bore', 'displacement') VALUES ('Bismarck','bb','Germany','8','15.0','42000');");
                    stmt.execute("INSERT INTO Classes('class', 'type', 'country', 'numGuns', 'bore', 'displacement') VALUES ('Iowa','bb','USA','9','16.0','46000');");
                    stmt.execute("INSERT INTO Classes('class', 'type', 'country', 'numGuns', 'bore', 'displacement') VALUES ('Kongo','bc','Japan','8','14.0','32000');");
                    stmt.execute("INSERT INTO Classes('class', 'type', 'country', 'numGuns', 'bore', 'displacement') VALUES ('North Carolina', 'bb','USA','12','16.0','37000');");
                    stmt.execute("INSERT INTO Classes('class', 'type', 'country', 'numGuns', 'bore', 'displacement') VALUES ('Renown','bc','Gt.Britain','6','15.0','32000');");
                    stmt.execute("INSERT INTO Classes('class', 'type', 'country', 'numGuns', 'bore', 'displacement') VALUES ('Revenge','bb','Gt.Britain','8','15.0','29000');");
                    stmt.execute("INSERT INTO Classes('class', 'type', 'country', 'numGuns', 'bore', 'displacement') VALUES ('Tennessee','bb','USA','12','14.0','32000');");
                    stmt.execute("INSERT INTO Classes('class', 'type', 'country', 'numGuns', 'bore', 'displacement') VALUES ('Yamato','bb','Japan','9','18.0','65000');");

            //insert in to Ships
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES ('California','Tennessee','1921');");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Haruna','Kongo','1916')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Hiei','Kongo','1914')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Iowa','Iowa','1943')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Kirishima','Kongo','1915')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Kongo','Kongo','1913')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Missouri','Iowa','1944')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Musashi','Yamato','1942')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('New Jersey','Iowa','1943')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('North Carolina','North Carolina','1941')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Ramillies','Revenge','1917')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Renown','Renown','1916')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Repulse','Renown','1916')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Resolution','Renown','1916')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Revenge','Revenge','1916')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Royal Oak','Revenge','1916')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Royal Sovereign','Revenge','1916')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('South Dakota','North Carolina','1941')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Tennessee','Tennessee','1920')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Washington','North Carolina','1941')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Wisconsin','Iowa','1944')");
            stmt.execute("INSERT INTO Ships('name', 'class', 'launched') VALUES('Yamato','Yamato','1941');");

            //insert in to Battles
            stmt.execute("INSERT INTO Battles('name', 'date') VALUES ('#Cuba62a','1962-10-20 00:00:00.000');");
            stmt.execute("INSERT INTO Battles('name', 'date') VALUES ('#Cuba62b','1962-10-25 00:00:00.000');");
            stmt.execute("INSERT INTO Battles('name', 'date') VALUES ('Guadalcanal','1942-11-15 00:00:00.000');");
            stmt.execute("INSERT INTO Battles('name', 'date') VALUES ('North Atlantic','1941-05-25 00:00:00.000');");
            stmt.execute("INSERT INTO Battles('name', 'date') VALUES ('North Cape','1943-12-26 00:00:00.000');");
            stmt.execute("INSERT INTO Battles('name', 'date') VALUES ('Surigao Strait','1944-10-25 00:00:00.000');");

            //insert in to Outcomes
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('Bismarck','North Atlantic','sunk');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('California','Guadalcanal','damaged');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('California','Surigao Strait','ok');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('Duke of York','North Cape','ok');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('Fuso','Surigao Strait','sunk');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('Hood','North Atlantic','sunk');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('King George V','North Atlantic','ok');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('Kirishima','Guadalcanal','sunk');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('Prince of Wales','North Atlantic','damaged');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('Rodney','North Atlantic','ok');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('Schamhorst','North Cape','sunk');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('South Dakota','Guadalcanal','damaged');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('Tennessee','Surigao Strait','ok');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('Washington','Guadalcanal','ok');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('West Virginia','Surigao Strait','ok');");
            stmt.execute("INSERT INTO Outcomes('ship', 'battle', 'result')VALUES ('Yamashiro','Surigao Strait','sunk');");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("insert complete");
    }

    /**
     * create query whos delete lines whit ship upwards 1943
     */
    public void deleteDB(){
        try {
            stmt.execute("DELETE FROM Battles " +
                    " WHERE date>'1943-12-31'");
            stmt.execute("DELETE FROM Ships WHERE name IN(SELECT ship FROM Outcomes WHERE Outcomes.battle NOT IN (SELECT name FROM Battles))");
            stmt.execute("DELETE FROM outcomes WHERE battle NOT IN (SELECT name FROM battles)");
            stmt.execute("DELETE FROM classes WHERE class NOT IN (SELECT class FROM ships)");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * method for output information from database
     */
    public void printDB(){
        try {
            System.out.println(" --- Table Classes --- ");
            resSet = stmt.executeQuery("SELECT * FROM Classes");
            while(resSet.next()){
                String a = resSet.getString("class");
                String b = resSet.getString("type");
                String c = resSet.getString("country");
                int d = resSet.getInt("numGuns");
                float e = resSet.getFloat("bore");
                int f = resSet.getInt("displacement");
                System.out.println(a + " " + b+" " + c +" "+d+" "+e + " "+ f);
            }

            System.out.println(" --- Table Ships --- ");
            resSet = stmt.executeQuery("SELECT * FROM Ships");
            while(resSet.next()){
                String a = resSet.getString("name");
                String b = resSet.getString("class");
                int c = resSet.getInt("launched");
                System.out.println(a + " " + b+" " + c);
            }

            System.out.println(" --- Table Outcomes --- ");
            resSet = stmt.executeQuery("SELECT * FROM Outcomes");
            while(resSet.next()){
                String a = resSet.getString("ship");
                String b = resSet.getString("battle");
                String c = resSet.getString("result");
                System.out.println(a + " " + b+" " + c);
            }

            System.out.println(" --- Table Battles --- ");
            resSet = stmt.executeQuery("SELECT * FROM Battles");
            while(resSet.next()){
                String a = resSet.getString("name");
                Date b = resSet.getDate("date");
                System.out.println(a + " " + b+" ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
