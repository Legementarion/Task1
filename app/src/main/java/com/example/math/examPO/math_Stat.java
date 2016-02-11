package com.example.math.examPO;


import java.util.Objects;

public class math_Stat {
    //max, min;
    // отдельно main - print, input

    public String compare(Objects obj, String type){
        StringBuilder result = new StringBuilder();
        int  min=0, max=0;

        result.append("min - "+min + "; max - "+max);
        return result.toString();
    }


}
