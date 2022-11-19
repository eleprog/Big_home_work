package com.mycompany.task_0_1;

public class Task_0_1 {

    public static int[] CreateArray(int size, int rangeLo, int rangeHi)
    {
        if(size == 0)
            return null;
            
        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
            arr[i] = rangeLo + (int)(Math.random() * rangeHi);
  
        return arr;
    }
    
    public static void PrintArray(int[] arr)
    {
        if(arr != null)
            for(int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " "); 
        else
            System.out.print("array is empty");
    }
    
    public static void main(String[] args)
    {
        int[] array = CreateArray(10, 15, 256);
        PrintArray(array);
    }
}
