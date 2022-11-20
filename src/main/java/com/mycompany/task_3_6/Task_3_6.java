package com.mycompany.task_3_6;

public class Task_3_6
{
    static int TraversalTriangle(int mtrx[][])
    {
        int sum = 0;
        if(mtrx == null || (mtrx.length != mtrx[0].length))
            return sum;
        
        int indexHi = mtrx.length - 1;
        for(int i = 0; i < (mtrx.length + 1) / 2; i++)
            for(int j = indexHi / 2 - i; j <= mtrx.length / 2 + i; j++)
                sum += mtrx[i][j];
        
        return sum;
    }
    
    public static void main(String[] args) 
    {
        int[][] matrix = {{9,9,1,9,9},
                          {9,1,1,1,9},
                          {1,1,1,1,1},
                          {9,9,9,9,9},
                          {9,9,9,9,9}};
        
        /*int[][] matrix = {{9,9,1,1,9,9},
                          {9,1,1,1,1,9},
                          {1,1,1,1,1,1},
                          {9,9,9,9,9,9},
                          {9,9,9,9,9,9},
                          {9,9,9,9,9,9}};*/
        
        System.out.println(TraversalTriangle(matrix));
    }
}
