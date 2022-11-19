package com.mycompany.task_1_0;
import java.util.Scanner;

public class Task_1_0
{
    static int SearchForArrayElement(int[] arr, int value)
    {
        if(arr != null)
            for(int i = 0; i < arr.length; i++)
                if(arr[i] == value)
                    return i;
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner myScnr = new Scanner(System.in);
        
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        
        System.out.print("Enter the number: ");
        int value = myScnr.nextInt();
        
        System.out.println(SearchForArrayElement(array, value));
    }
}
