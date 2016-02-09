package com.example.math;


import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int buff=0;
        int step = 0;
        StringBuilder buf = new StringBuilder();
        System.out.println("input number");
            try {
//                buff = in.nextInt();
//                System.out.println("input stepen");
//                step = in.nextInt();
            } catch (InputMismatchException ex) {
                ex.printStackTrace();
                System.out.println(" -only number!!");
            }

        math_a_p a= new math_a_p();
        Conv c = new Conv();

//        System.out.println(c.decToBit(buff));
//        System.out.println(c.decToHex(buff));
//          System.out.println(c.bitToHex(buf.toString()));

//        System.out.println(a.pow(buff));
//        System.out.println(a.sqrt(buff));
//        System.out.println(a.sqrtA(buff));
//        System.out.println(a.sqrtAf(buff));
//        System.out.println(a.sqrtKub(buff));
//        System.out.println(a.sq(buff, step, 5));

            int n =10;
            while(true) {
                n++;
                System.out.println(a.factor(n));
                if (a.factor(n)==0){
                    System.out.println(n + " -n");
                    break;
                }
            }


    }
}
