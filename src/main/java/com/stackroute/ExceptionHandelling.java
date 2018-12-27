package com.stackroute;

public class ExceptionHandelling {
    String string;
    public ExceptionHandelling(String string)
    {
        this.string = string;
    }

    public boolean main(int[] ints){

        try{
            ints=new int[5];
            ints[8]=10;

        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getClass().toString());

        }finally {

            System.out.println(string);
        }
        return true;
    }
}
