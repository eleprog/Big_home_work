package com.mycompany.task_2_0;

public class Task_2_0 
{
    
    static void BubbleSort(int[] arr)
    {
        if(arr == null || arr.length < 2)
            return;
        
        int lastSwap = arr.length;
        while(lastSwap > 0)
        {
            int lastSwapTmp = 0;
            for(int i = 1; i < lastSwap; i++)       
                if(arr[i-1] > arr[i])
                {
                    int swapTmp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = swapTmp;
                    lastSwapTmp = i;
                }
            lastSwap = lastSwapTmp;
        }
    }
    
    public static void main(String[] args)
    {
        //int [] array = {6,7,8,1,2,3,4,5,10,11,12,13};
        //int [] array = {1,2,3,4,5,6,7,8,9,10};
        int [] array = {10,9,8,7,6,5,4,3,2,1,0};
        //int [] array = {1,3,5,7,9,0,2,4,6,8,10};
        //int [] array = {56,24,57,13,57,83,25,84,87,45,15,88,74,15,69,89};
        
        BubbleSort(array);
        
        System.out.print("Sort array: ");
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
