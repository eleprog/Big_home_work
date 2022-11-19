package com.mycompany.task_1_3;

public class Task_1_3 
{
    static int ProductArrayElements(int[] arr)       
    {
        if(arr != null)
        {
            int product = arr[0];
            for(int i = 1; i < arr.length; i++)
                product *= arr[i];
            return product;
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(ProductArrayElements(array));
    }
}
