package com.example.math.DataBase;

/**
 * Created by Lego on 12.02.2016.
 */
public class MainForDB {
    Ships_db db = new Ships_db();

    public void start(){
        db.createTable();
        db.insertIntoTable();
    }

    public void print(){

    }
}
