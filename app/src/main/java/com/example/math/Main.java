package com.example.math;


import com.example.math.DataBase.MainForDB;
import com.example.math.Matrix.General;
import com.example.math.examPo.GenMass;
import com.example.math.examPo.Math_stat;
import com.example.math.generation.SecondName;


import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String args[]){
        Object obj = null;

        Scanner in = new Scanner(System.in);
        int buff=0;
        int step = 5;
        StringBuilder buf = new StringBuilder("");


        RestJson restJson = new RestJson();

//        restJson.weather();


        DB_test db = new DB_test();
//        db.go();

        MainForDB dbTask = new MainForDB();
        dbTask.start();

//        buf.append(in.nextLine());

//
        Regex regex = new Regex();
//        System.out.println(regex.firmName("Lama PaPa"));
//        System.out.println(regex.timeApi());

        SecondName secondName = new SecondName();
//        secondName.start();

        General general = new General();
//        general.go();


            try {
//                System.out.println("input type");
//                buf.append(in.nextLine());
//                System.out.println("input size");
                step = in.nextInt();
            } catch (InputMismatchException ex) {
                ex.printStackTrace();
                System.out.println(" -only number!!");
            }


        GenMass result = new GenMass();
        result.genByType(step);
        /*
        if(!(buf.equals("")&&(step!=0))){
            System.out.println(" -method1");
            result.genByType(buf.toString().toLowerCase(),step);
        } else if((buf.equals("")&&(step!=0))){
            System.out.println(" -method2");
            result.genByType(step);
        } else if(!(buf.equals("")&&(step==0))) {
            System.out.println(" -method3");
            result.genByType(buf.toString().toLowerCase());
        } else if ((buf.equals(""))&&(step==0)){
            System.out.println(" -method4");
            result.genByType();
        }
        */
        System.out.println("object created");
        obj = result.getObject();

        System.out.println(result.getTypeS());
        System.out.print(Math_stat.compare(obj, result.getTypeS()));


        math_a_p a = new math_a_p();
        Conv c = new Conv();


//          System.out.println(c.decToHex(3276));
//          System.out.println(c.bitToHex("110011001100"));
//          System.out.println(c.bitToHex(buf.toString()));

//        System.out.println(a.pow(buff));
//        System.out.println(a.sqrt(buff));
//        System.out.println(a.sqrtA(buff));
//        System.out.println(a.sqrtAf(buff));
//        System.out.println(a.sqrtKub(buff));
//        System.out.println(a.sq(buff, step, 4+2));

//            int n =10;
//            while(true) {
//                n++;
//                System.out.println(a.factor(n));
//                if (a.factor(n)==0){
//                    System.out.println(n + " -n");
//                    break;
//                }
//            }


    }
}
