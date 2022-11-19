package com.mycompany.task_0_4;
import java.util.Scanner;

public class Task_0_4 
{
    static boolean CheckNumberPrime(int value) //(0.4)//
    {
        if(value < 2)
            return false;
        
        for(int i = 2; i <= value / 2; i++)
            if(value % i == 0)
                return false;
        
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner myScnr = new Scanner(System.in);  
        
        System.out.print("Enter the number: ");
        int number = myScnr.nextInt();
        
        System.out.println(CheckNumberPrime(number));
    }
}
