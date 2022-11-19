package com.mycompany.task_0_2;

public class Task_0_2
{
    public static void FillArray(int[] arr, int rangeLo, int rangeHi)
    {
        if(arr != null)
            for(int i = 0; i < arr.length; i++)
                arr[i] = rangeLo + (int)(Math.random() * rangeHi);
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
        int[] array = new int[10];
        FillArray(array, 0, 10);
        PrintArray(array);
    }
}
