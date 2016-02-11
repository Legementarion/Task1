package com.example.math.examPO;


public class GenMath {
    //byte char short int string float


    public void genByType(String type, int size){

    }

    public void genByType(String type){
        int size = (int)(Math.random()*100);
    }

    public void genByType(int size){

    }

    public void genByType(){
        int size = (int)(Math.random()*100);

    }

    public byte[] genByte(int size){
        byte[] result = new byte[size];
        for (int i=0; i<result.length; i++){
            result[i] = (byte)(100*Math.random()%10);
        }
        return result;
    }

    public char[] genChar(int size){
        char[] result = null;
        return result;
    }

    public short[] genShort(int size){
        short[] result = new short[size];
        for (int i=0; i<result.length; i++){
            result[i] = (short)(100*Math.random()%10);
        }
        return result;
    }

    public int[] genInt(int size){
        int[] result = new int[size];
        for (int i=0; i<result.length; i++){
            result[i] =  (int)(100*Math.random()%10);
        }
        return result;
    }

    public String[] genString(int size){
        String[] result = new String[size];
        return result;
    }

    public float[] genFloat(int size){
        float[] result = new float[size];
        for (int i=0; i<result.length; i++){
                result[i] = (new Float(100*Math.random()%10));
        }
        return result;
    }
}
