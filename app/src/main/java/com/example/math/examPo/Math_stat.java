package com.example.math.examPo;

/**
 * Created by Lego on 12.02.2016.
 */
import java.util.Objects;

public abstract class Math_stat {
    public static String compare(Object obj, String type){
        StringBuilder result = new StringBuilder();
        int  min=0, max=0;
        switch (type){
            case "byte":
                byte[] massB = (byte[]) obj;
                min = massB[0];
                for (int i = 1; i < massB.length; i++) {
                    System.out.println(massB[i]);
                    if (min > massB[i]) {
                        min = massB[i];
                }
                    if (max < massB[i]) {
                        max = massB[i];
                    }
                }
                break;
            case "char":
                char[] massC = (char[]) obj;
                min = massC[0];
                for (int i = 1; i < massC.length; i++) {
                    if (min > massC[i]) {
                        min = massC[i];
                    }
                    if (max < massC[i]) {
                        max = massC[i];
                    }
                }
                break;
            case "short":
                short[] massS = (short[]) obj;
                min = massS[0];
                for (int i = 1; i < massS.length; i++) {
                    if (min > massS[i]) {
                        min = massS[i];
                    }
                    if (max < massS[i]) {
                        max = massS[i];
                    }
                }
                break;
            case "int":
                int[] massI = (int[]) obj;
                min = massI[0];
                for (int i = 1; i < massI.length; i++) {
                    System.out.println(massI[i]);
                    if (min > massI[i]) {
                        min = massI[i];
                    }
                    if (max < massI[i]) {
                        max = massI[i];
                    }
                }
                break;
            case "string":
                String[] mass = (String[]) obj;
                min = mass[0].charAt(0);
                for (int i = 0; i < mass.length; i++) {
                    for (int j = 0; j <mass[i].length(); j++){
                        System.out.print(mass[i].charAt(j));
                        if (min > mass[i].charAt(j)) {
                            min = mass[i].charAt(j);
                        }
                        if (max < mass[i].charAt(j)) {
                            max = mass[i].charAt(j);
                        }
                    }
                    System.out.println("\n");
                }
                break;
            case "float":
                float[] massF = (float[]) obj;
                 min = (int)massF[0];
                for (int i = 1; i < massF.length; i++) {
                    if (min > massF[i]) {
                    min = (int)massF[i];
                }
                    if (max < massF[i]) {
                        max = (int)massF[i];
                    }
                }
                break;
        }
        result.append("min - "+min + "; max - "+max);
        return result.toString();
    }
}