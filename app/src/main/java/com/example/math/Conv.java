package com.example.math;


public class Conv {
    public String decToBit(int a){
        StringBuffer answer = new StringBuffer();
        while (a>0){
            answer.append(a%2);
            a=a/2;
        }
        answer.reverse();
        return answer.toString();
    }

    public int bitToDec(String a){
        int answer=0;
        int i =0;
        while (i<a.length()){
            answer=a.charAt(i)*(int)Math.pow(2,a.length()-1-i);
        }
        return answer;
    }
}
