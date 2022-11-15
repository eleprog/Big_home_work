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
                
            case ("1.0"):
                int[] array0 = {0,1,2,3,4,5,6,7,8,9};
                IntWrite("Search index: ", SearchForArrayElement(array0, IntRead("Enter desired number: ")));
                break;
            case ("1.1"):
                int[] array1 = {0,1,2,3,4,5,6,7,8,9};
                IntWrite("Minimum value: ", SearchMinimumValue(array1));
                break;
            case ("1.2"):
                int[] array2 = {0,1,2,3,4,5,6,7,8,9};
                IntWrite("Sum of array elements: ", SumArrayElements(array2));
                break;
            case ("1.3"):
                int[] array3 = {1,2,3,4,5,6,7,8,9};
                IntWrite("Product of array elements: ", ProductArrayElements(array3));
                break;
            case ("1.4"):
                break;
            case ("1.5"):
                
                break;

            default:
                System.out.print("Error: the selected task number does not exist");
        }
    }

    static int[] SmallIncreaseTwoLargeDecreaseTwo(int a, int b, int c) //(0.0)//
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
    
    static int RemoveEvenNumbers(int numIn) //(0.3)//
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
    
    static int SearchForArrayElement(int[] arr, int value) //(1.0)//
    {
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == value)
                return i;
        return -1;
    }

    static int SearchMinimumValue(int[] arr) //(1.1)//
    {
        int tmp = arr[0];
        for(int i = 1; i < arr.length; i++)
            if(arr[i] < tmp)
                tmp = arr[i];
        return tmp;
    }
    
    static int SumArrayElements(int[] arr) //(1.2)//
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
    
    static int ProductArrayElements(int[] arr) //(1.3)//
    {
        int product = arr[0];
        for(int i = 1; i < arr.length; i++)
            product *= arr[i];
        return product;
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
    }
}
