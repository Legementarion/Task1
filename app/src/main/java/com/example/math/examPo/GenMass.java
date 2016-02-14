package com.example.math.examPo;

/**
 * Created by Lego on 12.02.2016.
 */
public class GenMass {
    private Object object = null;
    private String TypeS;


    public void genByType(String type, int size){

        switch (type){
            case "byte":
                setObject(genByte(size));
                setTypeS("byte");
                break;
            case "char":
                setObject(genChar(size));
                setTypeS("char");
                break;
            case "short":
                setObject(genShort(size));
                setTypeS("short");
                break;
            case "int":
                setObject(genInt(size));
                setTypeS("int");
                break;
            case "string":
                setObject(genString(size));
                setTypeS("string");
                break;
            case "float":
                setObject(genFloat(size));
                setTypeS("float");
                break;
        }

    }

    public void genByType(String type){
        int size = (int)(Math.random()*100);
        genByType(type, size);
    }

    public void genByType(int size){
        String[] type = {"byte","char","short","int","String","float"};
        int num = (int) (Math.random()*7);
        genByType(type[num],size);
    }

    public void genByType(){
        int size = (int)(Math.random()*100);
        genByType(size);
    }

    public byte[] genByte(int size){
        byte[] result = new byte[size];
        for (int i=0; i<result.length; i++){
            result[i] = (byte)(100*Math.random());
        }
        return result;
    }

    public char[] genChar(int size){
        char[] result = new char[size];
        for (int i=0; i<result.length; i++){
            result[i] = (char)(27*Math.random() + 97);
        }
        return result;
    }

    public short[] genShort(int size){
        short[] result = new short[size];
        for (int i=0; i<result.length; i++){
            result[i] = (short)(100*Math.random());
        }
        return result;
    }

    public int[] genInt(int size){
        int[] result = new int[size];
        for (int i=0; i<result.length; i++){
            result[i] =  (int)(100*Math.random());
        }
        return result;
    }

    public String[] genString(int size){
        String[] result = new String[size];
        int rand=0;
        char[] buff;
        for (int i=0; i<result.length; i++){
            rand = (int)(10*Math.random());
            buff = new char[rand];
            for (int j=0; j<rand; j++){
                buff[j] = (char)(27*Math.random() + 97);
            }
            result[i] = buff.toString();
        }
        return result;
    }

    public float[] genFloat(int size){
        float[] result = new float[size];
        for (int i=0; i<result.length; i++){
            result[i] = (float)(100*Math.random());
        }
        return result;
    }

    public Object getObject() {
        return this.object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getTypeS() {
        return TypeS;
    }

    public void setTypeS(String typeS) {
        TypeS = typeS;
    }
}