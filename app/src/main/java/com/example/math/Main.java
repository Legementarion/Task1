package com.example.math;


import com.example.math.Matrix.General;
import com.example.math.generation.SecondName;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int buff=624;
        int step = 4;
        StringBuilder buf = new StringBuilder();





//        buf.append(in.nextLine());

//        try {
//            URL url = new URL("http//timeapi.org/now");

//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }

        Regex regex = new Regex();
//        System.out.println(regex.firmName("Lama PaPa"));
//        System.out.println(regex.timeApi());

        SecondName secondName = new SecondName();
//        secondName.start();

        General general = new General();
//        general.go();


            try {
//                buff = in.nextInt();
//                System.out.println("input stepen");
//                step = in.nextInt();
            } catch (InputMismatchException ex) {
                ex.printStackTrace();
                System.out.println(" -only number!!");
            }

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
        System.out.println(a.sq(buff, step, 4+2));

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
