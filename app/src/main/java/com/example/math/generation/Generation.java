package com.example.math.generation;


public class Generation {
    Data data = new Data();


    public String gener(int i){
        StringBuilder secondName = new StringBuilder();
        StringBuilder buffer = new StringBuilder();
        int rand = (int) (Math.random()%8+2);

        for (int j=0; j<i; j++){
            for(int l=0; l<rand;l++){
                buffer.append(generateSynb(l));
                if(l==0){
                    buffer.toString().toUpperCase();
                }
            }
        }

        return secondName.toString();
    }

    private char generateSynb(int l){
        char result = 0;
        int random = (int)Math.random()%1;
        int randomNumberA = (int)Math.random()%9;
        int randomNumberZ = (int)Math.random()%20;

        if (random==1){
            result = data.massA[randomNumberA];
        }else{
            result = data.massA[randomNumberZ];
        }

        return result;
    }
}
