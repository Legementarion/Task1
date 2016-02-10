package com.example.math;


public class math_a {

    public int pow(int a){
        a=a*a;
        return a;
    }

    public int pow(int a, int b){
        int buff =1;
        while(b>1){
            buff=buff*a;
            b--;
        }
        return buff;
    }

    public double pow(double a, int b){
        double buff =1;
        while(b>0){
            buff=buff*a;
            b--;
        }
        return buff;
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
        while ((b*b)>a){
                b = b/2;
            System.out.println(b+" sqrtAf ");
        i++;
        }
        while((b*b)<a) {
            i++;
            b = b + 0.1;
        }
        while((b*b)>a) {
            i++;
            b = b - 0.01;
        }
        System.out.println(i+" sqrtAf iteration");
        return b;
    }

    public double sqrtKub(int a){
        double b=a/3;
        int i=0; // итерации

        while ((b*b*b)>a){
            b = b/3;
            i++;
        }
        while((b*b*b)<=a) {
            b = b + 0.1;
            i++;
        }

        System.out.println(i+" sqrtA iteration");

        return b;
    }

    public double sq(int a, int n){
        double b = a/n;
        int i=0; // итерации
        while ((pow(b,n))>a){
            b = b/n;
            i++;
        }
        while(pow(b,n)<a){
            b = b + 0.01;
            i++;
        }
        System.out.println(i+" sqrtA iteration");
        return (int)b;
    }
}


