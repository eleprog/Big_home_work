package com.mycompany.task_0_3;
import java.util.Scanner;

public class Task_0_3 
{
    static int RemoveEvenNumbers(int numIn)
    {
        int numOut = 0;
        int degree = 1;
        while(numIn > 0)
        {
            if(numIn % 2 == 1)
            {
                numOut += (numIn % 10) * degree;
                degree *= 10;
            }
            numIn /= 10;
        } 
        return numOut;
    }
    
    public static void main(String[] args) 
    {
        Scanner myScnr = new Scanner(System.in);  
        
        System.out.print("Enter the number: ");
        int number = myScnr.nextInt();
        
        System.out.println(RemoveEvenNumbers(number));
    }
}
