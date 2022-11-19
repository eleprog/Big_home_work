package com.mycompany.task_2_2;



public class Task_2_2 
{
    static void DirectBinarySearchSort(int[] arr)
    {
        if(arr == null || arr.length < 2)
            return;
        
        for(int sortedPart = 1; sortedPart < arr.length; sortedPart++)
        {        
            int tmp = arr[sortedPart];
            int index = 0;
            int highIndex = sortedPart;
            
            while(index <= highIndex)
            {
                int tmpIndex = (highIndex + index) / 2;
                if(tmp > arr[tmpIndex])
                    index = tmpIndex + 1;
                else if(tmp < arr[tmpIndex])
                    highIndex = tmpIndex - 1;
                else
                {
                    index = tmpIndex;
                    highIndex = tmpIndex - 1;
                }
            }
            for(int i = sortedPart; i > index; i--)
                arr[i] = arr[i-1];
            arr[index] = tmp;
        }
    }
    
    public static void main(String[] args) 
    {
        //int [] array = {10,10,9,9,8,8,7,7,6,6,5,5,4,4,3,3,2,2,1,1,0,0};
        //int [] array = {1};
        //int [] array = {6,7,8,9,1,2,3,4,5,10,11,12,13};
        //int [] array = {1,2,3,4,5,6,7,8,9,10};
        //int [] array = {10,9,8,7,6,5,4,3,2,1,0};
        //int [] array = {1,3,5,7,9,0,2,4,6,8,10};
        int [] array = {56,24,57,13,57,83,25,84,87,45,15,88,74,15,69,89};
        
        DirectBinarySearchSort(array);
        
        System.out.print("Sort array: ");
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
