package com.mycompany.task_3_5;

public class Task_3_5 
{
    static int TraversalRhombus(int mtrx[][])
    {
        int sum = 0;
        if(mtrx == null || (mtrx.length != mtrx[0].length))
            return sum;
        
        int len = mtrx.length;
        int indexHi = mtrx.length - 1;
        
        for(int i = 0; i < len / 2; i++)
            for(int j = indexHi / 2 - i; j <= len / 2 + i; j++)
            {
                sum += mtrx[i][j];
                sum += mtrx[indexHi - i][j];
            }
        if(len % 2 == 1)
            for(int i = 0; i < len; i++)
                sum += mtrx[indexHi / 2][i];

        return sum;
    }
    
    public static void main(String[] args)
    {
        /*int[][] matrix = {{9,9,1,9,9},
                          {9,1,1,1,9},
                          {1,1,1,1,1},
                          {9,1,1,1,9},
                          {9,9,1,9,9}};*/
        
        int[][] matrix = {{9,9,1,1,9,9},
                          {9,1,1,1,1,9},
                          {1,1,1,1,1,1},
                          {1,1,1,1,1,1},
                          {9,1,1,1,1,9},
                          {9,9,1,1,9,9}};
        
        System.out.println(TraversalRhombus(matrix));
    }
}