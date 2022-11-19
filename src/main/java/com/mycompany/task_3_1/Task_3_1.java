package com.mycompany.task_3_1;

public class Task_3_1 
{
    static int TraversalMostDiagonal(int mtrx[][])
    {
        int sum = 0;   
        if(mtrx == null || (mtrx.length != mtrx[0].length))
            return sum;
        
        for(int i = 0; i < mtrx.length; i++)
            for(int j = 0; j <= i; j++)
                sum += mtrx[i][j];
        return sum;
    }
    
    public static void main(String[] args) 
    {
        int[][] matrix = {{1,2,3,4,5},
                          {1,2,3,4,5},
                          {1,2,3,4,5},
                          {1,2,3,4,5},
                          {1,2,3,4,5}};
        
        System.out.println(TraversalMostDiagonal(matrix));
    }
}
