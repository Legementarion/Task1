package com.example.math.Matrix;




import java.util.*;

public class Generation {

    public int[][][] start(){
        int n = 5; // размер массива
        int[][][] mass = new int[n][n][n];

        List<List<List<Integer>>> list = new ArrayList<>();

        System.out.println("List array");
        for (int x=0; x<n; x++) {
            list.add(new ArrayList<List<Integer>>());
            for (int y = 0; y < n; y++) {
                list.get(x).add(new ArrayList<Integer>());
                for (int z = 0; z < n; z++) {
                    list.get(x).get(y).add((int) (10+Math.random()*100));
                    System.out.print(list.get(x).get(y).get(z) + " ");
                }
                System.out.println("\n");
            }
            System.out.println("-----------");
        }

        System.out.println("int[][][] array");
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
            System.out.println("\n");
            }
        System.out.println("-----------------");
        }


        return mass;
    }
}
