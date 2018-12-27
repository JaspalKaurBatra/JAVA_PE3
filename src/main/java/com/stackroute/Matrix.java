package com.stackroute;

public class Matrix {

    public int[][] sum(int m1[][], int m2[][],int row,int col){
        int[][] result = new int[row][col];
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }
}
