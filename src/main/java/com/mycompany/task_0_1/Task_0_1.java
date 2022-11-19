package com.mycompany.task_0_1;

public class Task_0_1 {

    public static int[] create_array(int size, int rangeLo, int rangeHi)
    {
        if(size == 0)
            return null;
            
        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
            arr[i] = rangeLo + (int)(Math.random() * rangeHi); // Генерация 1-го числа
  
        return arr;
    }
    
    public static void print_array(int[] arr)
    {
        if(arr != null)
            for(int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " "); 
        else
            System.out.print("array is empty");
    }
    
    public static void main(String[] args)
    {
        int[] array = create_array(10, 15, 256);
        print_array(array);
    }
}
