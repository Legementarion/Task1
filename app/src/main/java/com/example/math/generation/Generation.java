package com.example.math.generation;


public class Generation implements MyCallBack {

    boolean random = true;

    public String gener(int i){
        StringBuilder buffer = new StringBuilder();
        int rand = (int) (Math.random()*8+2);


        for (int j=0; j<i; j++){
            for(int l=0; l<rand;l++){
                if(l==0){
                    buffer.append(Character.toUpperCase(generateSynb()));
                }else{
                    buffer.append(generateSynb());
                }
                rand = (int) (Math.random()*8+2);
            }
            buffer.append("\n");
        }

        return buffer.toString();
    }

    private char generateSynb(){
        Character result = 0;
        int randomNumberA = (int)(Math.random()*9);
        int randomNumberB = (int)(Math.random()*20);

        if (random==true){
            result = massA[randomNumberA];
            random = false;
        }else if(random==false){
            result = massB[randomNumberB];
            random = true;
        }
        return result;
    }
}
