/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task_3_1;

/**
 *
 * @author Eugene
 */
public class Task_3_1 
{
    static int TraversalMostDiagonal(int mtrx[][])
    {
        int sum = 0;   
        if(mtrx == null)
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
