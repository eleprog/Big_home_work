package com.mycompany.task_4_0;
import java.util.Scanner;

public class Task_4_0 
{
    public static int[] SearchWay(int[][] arr, int pointA, int pointB)
    {
        if(arr == null)
            return null;
        
        int len = arr.length;
        int [] stack = new int[len];
        int stackPointer = 0;
        boolean [] flags = new boolean[len];
        
        stack[0] = pointA;
        flags[pointA] = true;
        
        while(stackPointer >= 0)
        {      
            int tmp = -1;       
            for(int i = 0; i < len && tmp == -1; i++)
                if(arr[stack[stackPointer]][i] > 0 && !flags[i])
                {
                    tmp = i;
                    stack[++stackPointer] = i;
                    flags[i] = true;
                }
            
            if(tmp == pointB)   
            {
                int[] a = new int[stackPointer + 1];
                System.arraycopy(stack, 0, a, 0, stackPointer + 1);
                return a;
            }
            
            if(tmp == -1)
                stackPointer--;
        }   
        return null;
    }
     
    public static void PrintArray(int[] array)
    {
        if(array == null)
            System.out.println("null");
        else
            for(int i = 0; i < array.length; i++)
                System.out.print(array[i] + " ");
    }
            
    public static void main(String[] args) 
    {       
        int[][] matrix = {{0,1,0,0,0,0},
                          {0,0,1,0,1,0},
                          {1,0,0,1,0,1},					 
                          {1,0,0,0,0,1},
                          {0,0,0,0,0,0},
                          {0,0,0,0,0,0}};
        
        Scanner myScnr = new Scanner(System.in);     
        System.out.print("First point: ");
        int firstPoint = myScnr.nextInt();
        System.out.print("Second point: ");
        int secondPoint = myScnr.nextInt();
             
        PrintArray(SearchWay(matrix, firstPoint, secondPoint));      
    }
}
