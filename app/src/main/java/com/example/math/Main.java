package com.example.math;


import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int buff=12;
        StringBuilder buf = new StringBuilder();
        System.out.println("input number");

        buf.append(in.nextLine());

        /*
            try {
                buff = in.nextInt();
            } catch (InputMismatchException ex) {
                ex.printStackTrace();
                System.out.println(buff+" -only number!!");
            }
*/
        math_a a= new math_a();
        Conv c = new Conv();

//        System.out.println(c.decToBit(buff));
//        System.out.println(c.decToHex(buff));
//          System.out.println(c.bitToHex(buf.toString()));

//        System.out.println(a.pow(buff));
//        System.out.println(a.sqrt(buff));
//        System.out.println(a.sqrtA(buff));
        System.out.println(a.sqrtAf(buff));

    }
}
