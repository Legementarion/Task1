package com.example.math;

import java.sql.*;

/**
 * Created by Lego on 12.02.2016.
 */
public class DB_test {
    public static ResultSet resSet;
    public void go() {
        Connection c = null;
        Statement stmt = null;
        try {
            try {
                Class.forName("org.sqlite.JDBC");


            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
            try {
                c = DriverManager.getConnection("jdbc:sqlite://C:\\Users\\Lego\\Desktop\\SQLiteStudio\\test.db");
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            stmt.execute("CREATE TABLE if not exists 'users' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' varchar, 'teacher' bool);");
//            stmt.execute("INSERT INTO users('name', 'teacher')"+
//            " VALUES ('Nick', 'false' );");
//            stmt.execute("INSERT INTO users('name', 'teacher')"+
//                    " VALUES ('Ksey', 'false' );");
//            stmt.execute("INSERT INTO users('name', 'teacher')"+
//                    " VALUES ('June', 'false' );");
//            stmt.execute("INSERT INTO users('name', 'teacher')"+
//                    " VALUES ('Lego', 'false' );");
//            stmt.execute("INSERT INTO users('name', 'teacher')"+
//                    " VALUES ('Skif', 'false' );");
//            stmt.execute("INSERT INTO users('name', 'teacher')"+
//                    " VALUES ('Mark', 'false' );");
//            stmt.execute("INSERT INTO users('name', 'teacher')"+
//                    " VALUES ('Holodov', 'true' );");

//            resSet = stmt.executeQuery("SELECT * FROM users");
//            while(resSet.next()){
//             int a = resSet.getInt("id");
//             String b = resSet.getString("name");
//             boolean d = resSet.getBoolean("teacher");
//                System.out.println(a + " " + b+" " + d);
//            }

            stmt.execute("DROP TABLE 'users'");

            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }


        System.out.println("Table created successfully");
    }
}

