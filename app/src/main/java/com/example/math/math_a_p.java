package com.example.math;



public class math_a_p extends math_a {
    int buff;

    public double sq(int a, int n, int p){
        double b = a/2;
        String result;
        int i=0; // итерации
        while ((pow(b,n))>a){
            b = b/2;
            i++;
        }
        double buf = 0.1;
        for(int j=0; j<p; j++) {
            while (pow(b, n) <= a) {
                b = b + buf;
                i++;
            }
            buf = buf / (10);
            while (pow(b, n) > a) {
                b = b - buf;
                i++;
            }
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
