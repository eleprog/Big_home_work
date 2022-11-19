package com.mycompany.task_2_1;

public class Task_2_1 
{
    static void ShakerSort(int[] arr)
    {
        if(arr == null || arr.length < 2)
            return;
        
        int lastLoSwap = 0;
        int lastHiSwap = arr.length-1;
        
        while(lastLoSwap != lastHiSwap)
        {
            int lastSwapTmp = 0;
            for(int i = lastLoSwap; i < lastHiSwap; i++)
                 if(arr[i] > arr[i+1])
                 {
                     int swapTmp = arr[i];
                     arr[i] = arr[i+1];
                     arr[i+1] = swapTmp;
                     lastSwapTmp = i;
                 }
            lastHiSwap = lastSwapTmp;
            
            for(int i = lastHiSwap; i > lastLoSwap; i--)
                 if(arr[i] < arr[i-1])
                 {
                     int swapTmp = arr[i-1];
                     arr[i-1] = arr[i];
                     arr[i] = swapTmp;
                     lastSwapTmp = i;
                 }
            lastLoSwap = lastSwapTmp;           
        }
    }
    public static void main(String[] args) 
    {
        //int [] array = {6,7,8,1,2,3,4,5,10,11,12,13};
        //int [] array = {1,2,3,4,5,6,7,8,9,10};
        int [] array = {11,10,9,8,7,6,5,4,3,2,1,0};
        //int [] array = {1,3,5,7,9,0,2,4,6,8,10};
        //int [] array = {56,24,57,13,57,83,25,84,87,45,15,88,74,15,69,89};

        ShakerSort(array);
        
        System.out.print("Sort array: ");
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + ", ");
    }
}