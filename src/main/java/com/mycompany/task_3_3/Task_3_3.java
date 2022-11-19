package com.mycompany.task_3_3;

public class Task_3_3 
{
    static int TraversalСrossDiagonal(int mtrx[][])
    {
        int sum = 0;   
        if(mtrx == null || (mtrx.length != mtrx[0].length))
            return sum;
        
        int indexHi = mtrx.length - 1;
        for(int i = 0; i < mtrx.length / 2; i++)
        {
            sum += mtrx[i][i];  
            sum += mtrx[i][indexHi - i];
            sum += mtrx[indexHi - i][i];
            sum += mtrx[indexHi - i][indexHi - i];
        }
        if(mtrx.length % 2 == 1)
            sum += mtrx[indexHi/2][indexHi/2];
        return sum;
    }
    
    public static void main(String[] args) 
    {
        /*int[][] matrix = {{1,9,9,9,1},
                          {9,1,9,1,9},
                          {9,9,1,9,9},
                          {9,1,9,1,9},
                          {1,9,9,9,1}};*/
        
        int[][] matrix = {{1,9,9,9,9,1},
                          {9,1,9,9,1,9},
                          {9,9,1,1,9,9},
                          {9,9,1,1,9,9},
                          {9,1,9,9,1,9},
                          {1,9,9,9,9,1}};
        
        System.out.println(TraversalСrossDiagonal(matrix));
    }
}
