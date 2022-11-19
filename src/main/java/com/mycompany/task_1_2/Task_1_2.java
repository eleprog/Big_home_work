package com.mycompany.task_1_2;

public class Task_1_2 
{
    static int SumArrayElements(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
    
    public static void main(String[] args) 
    {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(SumArrayElements(array));
    }
}
