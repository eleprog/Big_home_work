package com.mycompany.task_3_0;

public class Task_3_0 
{
    static int[] MinimumElementPosition(int[][] mtrx)
    {
        int[] pos = {0,0};
        if (mtrx == null)
            return pos;
        
        int tmp = mtrx[0][0]; 
        for(int i = 0; i < mtrx.length; i++)
            for(int j = 0; j < mtrx[0].length; j++)
                if(mtrx[i][j] < tmp)
                {
                    tmp = mtrx[i][j];
                    pos[0] = i;
                    pos[1] = j;
                }
        return pos;
    }
    
    public static void main(String[] args) 
    {
        int[][] matrix = {{1,2,3,4,5,6,7},
                          {1,2,3,4,5,6,7},
                          {1,2,3,4,5,6,7},
                          {1,2,3,4,5,6,0},
                          {1,2,3,4,5,6,7}};
        
        int[] pos = MinimumElementPosition(matrix);
        System.out.print("Row: " + pos[0] + " Column: " + pos[1]);
    }
}
