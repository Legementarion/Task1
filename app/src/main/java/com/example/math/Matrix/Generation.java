package com.example.math.Matrix;




import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Generation {

    public int[][][] start(){
        int n = 5; // размер массива
        int[][][] mass = new int[n][n][n];


        for (int x=0; x<n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    mass[x][y][z] = (int) (10+Math.random()*100);

                }
            }
        }

        for (int x=0; x<n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    System.out.print(mass[x][y][z] + " ");
                }
            System.out.println("");
            }
        System.out.println("-----------------");
        }


        return mass;
    }
}
