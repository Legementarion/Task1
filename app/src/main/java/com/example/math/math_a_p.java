package com.example.math;



public class math_a_p extends math_a {
    int buff;
    @Override
    public double sq(int a, int n, int p){
        double b = a/n;
        String result;
        int i=0; // итерации
        while ((pow(b,n))>a){
            b = b/n;
            i++;
            System.out.println(pow(b,n)+" -pow");
            System.out.println(b+" -b");
        }
        while(pow(b,n)<a){
            b = b + 0.01;
            i++;
        }
        System.out.println(i+" sqrtA iteration");
        result = Double.toString(b);
        System.out.println(result+" result");
        result = result.substring(0, p);
        b = Double.valueOf(result);
        return b;
    }

    public int factor(int n){
        buff=n;
        while(n>1) {
            n--;
            buff = buff *n;
        }
        return buff;
    }
}
