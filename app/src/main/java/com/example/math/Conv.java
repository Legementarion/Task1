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

    public int bitToDec(String str){
        int answer = 0;
        int i = 0;
        while (i<str.length()){
            if(str.substring(i,i+1).equals("1")){
                answer+= (int) Math.pow(2, str.length()-(i+1));
            }
            i++;
        }
        return answer;
    }

    public String decToHex(int a){
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuffer answer = new StringBuffer();
        while (a>0){
            answer.append(hex[a%16]);
            a=a/16;
        }
        answer.reverse();
        return answer.toString();
    }

    public int hexToDec(String str){
        int i=0;
        int index;
        int result = 0;
        String hex ="0123456789ABCDEF";

        str.toUpperCase();
        while (i<str.length()){
            index = hex.indexOf(str.substring(i, i + 1));
            result += index*(int) Math.pow(16, str.length()-(i+1));
            i++;
        }

        return result;
    }

    public String hexToBit(String str){
        int i=0;
        int index;
        StringBuilder result = new StringBuilder();
        String hex ="0123456789ABCDEF";

        str.toUpperCase();
        while (i<str.length()){
            index = hex.indexOf(str.substring(i, i + 1));
            while (index>0){
                result.append(index%2);
                index = index/2;
            }
            i++;
        }

        return result.toString();
    }

    public String bitToHex(String str){
        int i = 0;
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int index = 0;
        StringBuilder result = new StringBuilder();

        while (i<str.length()){
            if(str.substring(i,i+1).equals("1")) {
                index+= (int) Math.pow(2, str.length() - (i + 1));
            }
            i++;
        }

        while (index>0) {
            result.append(hex[index%16]);
            index = index/16;
        }
        return result.toString();
    }

}
