package com.example.math.DataBase;

/**
 * @author Lego 12.02.2016.
 * @version 1.2
 */
public class MainForDB {
    //*create object of db connection  */
    Ships_db db = new Ships_db();

    /**
     * method have tsk for work with db
     */
    public void start(){
        db.createTable();
        db.insertIntoTable();
        System.out.println("---------------------------------------");
        db.printDB();
        db.deleteDB();
        System.out.println("---------------------------------------");
        db.printDB();
    }
}
