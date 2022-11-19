package com.mycompany.task_3_2;

public class Task_3_2 
{
    static int TraversalSecondaryDiagonal(int mtrx[][])
    {
        int sum = 0;   
        if(mtrx == null || (mtrx.length != mtrx[0].length))
            return sum;   
        for(int i = 0; i < mtrx.length; i++)
            for(int j = 0; j <= i; j++)
                sum += mtrx[i][mtrx.length - j - 1];
        return sum;
    }
    
    public static void main(String[] args) 
    {
        int[][] matrix = {{1,2,3,4,5},
                          {1,2,3,4,5},
                          {1,2,3,4,5},
                          {1,2,3,4,5},
                          {1,2,3,4,5}};
        
        System.out.println(TraversalSecondaryDiagonal(matrix));
    }
}
