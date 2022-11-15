package com.mycompany.mavenproject3;
import java.io.*;
import java.util.Scanner;

public class Mavenproject3
{
    static Scanner myScnr = new Scanner(System.in);
    
    static String LineRead(String a)
    {
        System.out.print(a);
        String tmp = myScnr.nextLine();
        return tmp;
    }
    
    static int IntRead(String a)
    {
        System.out.print(a);
        int tmp = myScnr.nextInt();
        return tmp;
    }
    
    static void IntWrite(String a, int value)
    {
        System.out.print(a + value + " ");
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
        String task = LineRead("\n\nSelect task: ");
        switch (task)
        {
            case ("0.0"):
                int a = IntRead("Enter A: ");
                int b = IntRead("Enter B: ");
                int c = IntRead("Enter C: ");
                int[] data = SmallIncreaseTwoLargeDecreaseTwo(a, b, c);
                IntWrite("A = ", data[0]);
                IntWrite("B = ", data[1]);
                IntWrite("C = ", data[2]);
                
                break;
            case ("0.1"):
                break;
            case ("0.2"):
                break;
            case ("0.3"):
                IntWrite("Number without even: ", RemoveEvenNumbers(IntRead("Enter number: ")));
                break;
            case ("0.4"):
                break;

            default:
                System.out.print("Error: the selected task number does not exist");
        }
    }

    static int[] SmallIncreaseTwoLargeDecreaseTwo(int a, int b, int c)
    {
        int[] data = {a,b,c};
        
        if(a != b && b != c && c != a)
            if(data[0] > data[1])           // a>b
                if(data[1] > data[2])       // a>b b>c
                {
                    data[0] -= 2;
                    data[2] += 2;
                }
                else                        // a>b b<c
                {
                    data[1] += 2;
                    if(data[0] > data[2])   // a>b b<c a>c
                        data[0] -= 2;
                    else                    // a>b b<c a<c
                        data[2] -= 2;         
                }
            else                            // a<b
                if(data[1] < data[2])       // a<b b<c
                {
                    data[0] += 2;
                    data[2] -= 2;
                }
                else                        // a<b b>c
                {
                    data[1] -= 2;
                    if(data[0] > data[2])   // a<b b>c a>c
                        data[2] += 2;
                    else                    // a<b b>c a<c
                        data[0] += 2;
                }   
        return data;
    }    
    
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
