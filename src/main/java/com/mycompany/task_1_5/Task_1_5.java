package com.mycompany.task_1_5;

public class Task_1_5 
{
    static int ArrayTypeDefinition(int[] arr)
    {
        if(arr == null || arr.length < 2)
            return -2;
        
        if(arr[0] == arr[1])
        {
            for(int i = 2; i < arr.length; i++)
                if(arr[i] != arr[0])
                    return -2;
            return 0;
        }
        if(arr[0] > arr[1])
        {
            for(int i = 2; i < arr.length; i++)
                if(arr[i-1] <= arr[i])
                    return -2;    
            return -1;
        }                    
        for(int i = 2; i < arr.length; i++)
            if(arr[i-1] >= arr[i])
                return -2;
        return 1;
    }
    
    static void WriteArrayType(int type)
    {
        switch(type)
        {
            case 1:
                System.out.println("Array increasing"); break;
            case 0:
                System.out.println("All array elements are equal"); break;
            case -1:
                System.out.println("Array decreasing"); break;
            default:
                System.out.println("Array is not ordered"); break;
        }
    }
    
    public static void main(String[] args) 
    {
        int[] array0 = {0,1,2,3,4,5,6,7,8,9};
        WriteArrayType(ArrayTypeDefinition(array0));
        
        int[] array1 = {9,8,7,6,5,4,3,2,1,0};
        WriteArrayType(ArrayTypeDefinition(array1));
        
        int[] array2 = {5,5,5,5,5,5,5,5,5,5};
        WriteArrayType(ArrayTypeDefinition(array2));
        
        int[] array3 = {9,8,7,6,5,4,4,2,1,0};
        WriteArrayType(ArrayTypeDefinition(array3));
    }
}
