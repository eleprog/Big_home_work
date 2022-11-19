package com.mycompany.task_1_1;

public class Task_1_1 
{
    static int SearchMinimumValue(int[] arr)
    {
        int tmp = arr[0];
        boolean elemEqualityFlag = true;
        
        for(int i = 1; i < arr.length && elemEqualityFlag; i++)
            if(arr[i] != tmp)
                elemEqualityFlag = false;
        
        if(elemEqualityFlag)
            return -1;
        
        for(int i = 1; i < arr.length; i++)
            if(arr[i] < tmp)
                tmp = arr[i];
        
        return tmp;
    }
    
    public static void main(String[] args) 
    {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(SearchMinimumValue(array));
    }
}
