package com.stackroute;

public class ExceptionTypes {

    //method for NegativeArraySizeException
   public String arrayCreation(){
       String strNegativeSize = null;
       try {
           int arr[] = new int[-2];
           //int a = arr[-2];
       }
       catch (NegativeArraySizeException n){
          strNegativeSize=n.getClass().toString();
       }
       finally {
           System.out.println("running array creation finally");
       }
       return strNegativeSize;
   }
    public String arrayAccess(){
        String strIndex = null;
        try {
            int arr[] = new int[10];
            int a = arr[11];
        }
        catch (ArrayIndexOutOfBoundsException a){
            strIndex = a.getClass().toString();
        }
        finally {
            System.out.println("running array access finally");
        }
        return strIndex;
    }

    public String stringAccess(){
       String str = null;
       String strNull = null;
       try{
           char a = str.charAt(0);
       }
       catch (NullPointerException n){
           strNull = n.getClass().toString();
       }
       finally {
           System.out.println("running string access finally");
       }
       return strNull;
    }

}