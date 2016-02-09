package com.example.math;

/**
 * Created by Ольга on 08.02.2016.
 */
public class math_a {

    public int pow(int a){
        a=a*a;
        return a;
    }

    public int pow(int a, int b){
        while(b>0){
            a=a*a;
            b--;
        }
        return a;
    }



    public int sqrt(int a){
        int b;
        b=a/2;
        int i =0;
        while((b*b)>a){
            b--;
            i++;
        }
        System.out.println(i +" sqrt iteration");
        return b;
    }

    public int sqrtA(int a){
        int b=a/2;
        int i=0; // итерации

        while ((b*b)>a){
            b = b/2;
            i++;
        }

        System.out.println(i+" sqrtA iteration");
        return b;
    }

    public double sqrtAf(double a){
        double b=a/2;
        int i=0; // итерации
        Math.round(b);
        while ((b*b)!=a){
            if ((b*b)>a){
                b = b/2;
            }else if ((b*b)<=a){
                System.out.println(b+" -b");
                b=b+0.01;
            }

        i++;
        }



        System.out.println(i+" sqrtAf iteration");
        return b;
    }

}


