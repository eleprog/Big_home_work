package com.mycompany.mavenproject3;
import java.io.*;
import java.util.Scanner;

public class Mavenproject3 
{
   
    
    static int traversal_diagonal(int arr[][])
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                sum += arr[i][j];
                System.out.print(arr[i][j] + ", ");
            } 
        System.out.println();
        }
        return sum;
    }  
    
    static int traversal_hourglass(int arr[][])
    {
        int sum = 0;
        int len = arr.length;
        for(int i = 0; i < len / 2; i++)
        {
            for(int j = i; j < len - i; j++)
            {
                sum += arr[i][j];
                System.out.print(arr[i][j] + ", ");
                sum += arr[len - i - 1][j];
                System.out.print(arr[len - i - 1][j] + ", ");
            }
            System.out.println();
        }
        if(len % 2 > 0)
        {
            sum += arr[len / 2][len / 2];
            System.out.print(arr[len / 2][len / 2] + "\n");
                    
        }
        return sum;
    }
    
    static int traversal_rhombus(int arr[][])
    {
        int sum = 0;
        int len = arr.length;
        for(int i = 0; i < len / 2 + len % 2; i++)
        {
            for(int j = i; j < len - i; j++)
            {
                sum += arr[len / 2 - i][j];
                System.out.print(arr[len / 2 - i][j] + ", ");
                sum += arr[len / 2 + i][j];
                System.out.print(arr[len / 2 + i][j] + ", ");
            }
            System.out.println();
        }
        if(len % 2 > 0)
        {
            for(int i = 0; i < len; i++)
            {
                sum += arr[len / 2 + 1][i];
                System.out.print(arr[len / 2 + 1][i] + ", "); 
            }
                    
        }
        return sum;
    }
    
    static void MenuOutput() throws FileNotFoundException, IOException
    {
        FileInputStream file = new FileInputStream("tasks.txt");
        byte[] filein = new byte[1844];
        file.read(filein);
        int len = filein.length;
        for(int i = 0; i < len; i++)
            System.out.print((char)filein[i]);
    }
    
    static void TaskSelection()
    {
        Scanner myScnr = new Scanner(System.in);
        System.out.print("Select task: ");
        String task = myScnr.nextLine();
        
        switch (task)
        {
            case ("0.0"):          
                break; 
            case ("0.1"):      
                break;
            case ("0.2"):      
                break;
            case ("0.3"):      
                break;
            case ("0.4"):      
                break;
            
            default:
                System.out.print("Error: the selected job number does not exist");
        }
    }
     
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        MenuOutput();
        TaskSelection();
                
        


        
        
        
        /*int [][] matrix ={{1,2,3,4,5,6,7},
                          {1,2,3,4,5,6,7},
                          {1,2,3,4,5,6,7},
                          {1,2,3,4,5,6,7},
                          {1,2,3,4,5,6,7},
                          {1,2,3,4,5,6,7},
                          {1,2,3,4,5,6,7}};*/
        
        /*int [][] matrix ={{1,2,3,4,5,6,7,8},
                          {1,2,3,4,5,6,7,8},
                          {1,2,3,4,5,6,7,8},
                          {1,2,3,4,5,6,7,8},
                          {1,2,3,4,5,6,7,8},
                          {1,2,3,4,5,6,7,8},
                          {1,2,3,4,5,6,7,8},
                          {1,2,3,4,5,6,7,8}};
        
        System.out.println("sum: " + traversal_diagonal(matrix));
        System.out.println();
        System.out.println("sum: " + traversal_hourglass(matrix));
        System.out.println();
        System.out.println("sum: " + traversal_rhombus(matrix));*/    
    }
}
