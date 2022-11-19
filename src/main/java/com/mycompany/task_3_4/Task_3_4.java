package com.mycompany.task_3_4;

public class Task_3_4 
{
    static int TraversalСrossDiagonal(int mtrx[][])
    {
        int sum = 0;   
        if(mtrx == null || (mtrx.length != mtrx[0].length))
            return sum;
        
        int indexHi = mtrx.length - 1;
        for(int i = 0; i < mtrx.length / 2; i++)     
            for(int j = i; j <= indexHi - i; j++)
            {
                sum += mtrx[i][j];
                sum += mtrx[indexHi - i][j];        
            }
        
        if(mtrx.length % 2 == 1)
            sum += mtrx[indexHi/2][indexHi/2];
        return sum;
    }
    
    public static void main(String[] args) 
    {
        int[][] matrix = {{1,1,1,1,1},
                          {9,1,1,1,9},
                          {9,9,1,9,9},
                          {9,1,1,1,9},
                          {1,1,1,1,1}};
        
        /*int[][] matrix = {{1,1,1,1,1,1},
                          {9,1,1,1,1,9},
                          {9,9,1,1,9,9},
                          {9,9,1,1,9,9},
                          {9,1,1,1,1,9},
                          {1,1,1,1,1,1}};*/
        
        System.out.println(TraversalСrossDiagonal(matrix));
    }
}
