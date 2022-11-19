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
    
    static void Write(String a, int value)
    {
        System.out.print(a + value);
    }
    
    static void Write(String a, boolean value)
    {
        System.out.print(a + value);
    }
    
    static void Write(String a, int[] arr)
    {
        System.out.print(a);
        if(arr != null)
            for(int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
    }
    
    static void Write(String a, String b, int[] value)
    {
        System.out.print(a + value[0] + " " + b + value[1]);
    }
    
    static void Write(String a, String b, String c, int[] value)
    {
        System.out.print(a + value[0] + " " + b + value[1] + " " + c + value[2]);
    }
    
    static void MenuOutput() throws FileNotFoundException, IOException
    {
        FileInputStream file = new FileInputStream("tasks.txt");
        byte[] filein = new byte[1842];
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
                int[] data = SmallIncreaseTwoLargeDecreaseTwo(IntRead("Enter A: "), IntRead("Enter B: "), IntRead("Enter C: "));
                Write("A = ", "B = ", "C = ",data);          
                break;
                
            case ("0.1"):
                int[] data1 = CreateArray(IntRead("Enter size: "), IntRead("Enter low value: "), IntRead("Enter high value: "));
                Write("Input array: ",data1);
                break;
                
            case ("0.2"):
                int[] data2 = new int[IntRead("Enter size: ")];
                FillArray(data2, IntRead("Enter low value: "), IntRead("Enter high value: "));
                Write("Input array: ",data2);
                break;
                
            case ("0.3"):
                Write("Number without even: ", RemoveEvenNumbers(IntRead("Enter number: ")));
                break;
                
            case ("0.4"):
                Write("Number prime: ", CheckNumberPrime(IntRead("Enter number: ")));
                break;
                
            case ("1.0"):
                int[] array0 = {0,1,2,3,4,5,6,7,8,9};
                Write("Search index: ", SearchForArrayElement(array0, IntRead("Enter desired number: ")));
                break;
                
            case ("1.1"):
                int[] array1 = {0,1,2,3,4,5,6,7,8,9};
                Write("Minimum value: ", SearchMinimumValue(array1));
                break;
                
            case ("1.2"):
                int[] array2 = {0,1,2,3,4,5,6,7,8,9};
                Write("Sum of array elements: ", SumArrayElements(array2));
                break;
                
            case ("1.3"):
                int[] array3 = {1,2,3,4,5,6,7,8,9};
                Write("Product of array elements: ", ProductArrayElements(array3));
                break;
                
            case ("1.4"):
                int[] array4 = {0,1,2,3,4,5,6,7,8,9};
                Write("Most frequent value: ", MostFrequentValue(array4));
                break;
                
            case ("1.5"):
                break;
                
            case ("2.0"):
                break;
                
            case ("2.1"):
                break;
                
            case ("2.2"):
                break;
                
            case ("2.3"):
                break;
                
            case ("2.4"):
                break;
      
            case ("3.0"):
                int[][] matrix0 = {{1,2,3,4,5,6,7},
                                   {1,2,3,4,5,6,7},
                                   {1,2,3,4,5,6,7},
                                   {1,2,3,4,5,6,0},
                                   {1,2,3,4,5,6,7}};
                Write("Row: ", "Column: ", MinimumElementPosition(matrix0));
                break;
                
            case ("3.1"):
                int[][] matrix1 = {{1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5},					 
                                   {1,2,3,4,5},
                                   {1,2,3,4,5}};
                Write("Sum elements under main diagonal: ", TraversalMostDiagonal(matrix1));
                break;
                
            case ("3.2"):
                break;
                
            case ("3.3"):
                break;
                
            case ("3.4"):
                break;
                
            case ("3.5"):
                break;
                
            case ("3.6"):
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
    
    public static int[] CreateArray(int size, int rangeLo, int rangeHi) //(0.1)//
    {
        if(size == 0)
            return null;
            
        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
            arr[i] = rangeLo + (int)(Math.random() * rangeHi);
  
        return arr;
    }
    
    public static void FillArray(int[] arr, int rangeLo, int rangeHi) //(0.2)//
    {
        if(arr != null)
            for(int i = 0; i < arr.length; i++)
                arr[i] = rangeLo + (int)(Math.random() * rangeHi);
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
    
    static boolean CheckNumberPrime(int value) //(0.4)//
    {
        for(int i = 2; i <= value / 2; i++)
            if(value % i == 0)
                return false;
        
        return true;
    }
            
    static int SearchForArrayElement(int[] arr, int value) //(1.0)//
    {
        if(arr != null)
            for(int i = 0; i < arr.length; i++)
                if(arr[i] == value)
                    return i;
        return -1;
    }

    static int SearchMinimumValue(int[] arr) //(1.1)//
    {
        if(arr == null)
            return -1;
        
        boolean elemEqualityFlag = true;
        for(int i = 1; i < arr.length && elemEqualityFlag; i++)
            if(arr[0] != arr[i])
                elemEqualityFlag = false;
        if(elemEqualityFlag)
            return -1;
        
        int tmp = arr[0]; 
        for(int i = 1; i < arr.length; i++)
            if(arr[i] < tmp)
                tmp = arr[i];
        
        return tmp;
    }
    
    static int SumArrayElements(int[] arr) //(1.2)//
    {
        int sum = 0;
        if(arr != null)
            for(int i = 0; i < arr.length; i++)
                sum += arr[i];
        return sum;
    }
    
    static int ProductArrayElements(int[] arr) //(1.3)//         
    {
        if(arr == null)
            return 0;
        
        int product = arr[0];
        for(int i = 1; i < arr.length; i++)
            product *= arr[i];
        
        return product;     
    }
    
    static int MostFrequentValue(int[] arr) //(1.4)//
    { 
        if(arr == null)
            return 0;
        
        int frequentValue = arr[0];
        int frequentValueAmount = 1;
        boolean[] flags = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            if(!flags[i])
            {
                int tmp = 0;
                for(int j = i; j < arr.length; j++)
                    if(arr[i] == arr[j])
                    {
                        flags[j] = true;
                        tmp++;
                    }

                if(tmp > frequentValueAmount)
                {
                    frequentValue = arr[i];
                    frequentValueAmount = tmp;
                } 
            }             
        }  
        return frequentValue;  
    }
    
    static int[] MinimumElementPosition(int[][] mtrx) //(3.0)//
    {
        int tmp = mtrx[0][0];
        int[] pos = new int[2];
        for(int i = 0; i < mtrx.length; i++)
            for(int j = 0; j < mtrx[0].length; j++)
                if(mtrx[i][j] < tmp)
                {
                    tmp = mtrx[i][j];
                    pos[0] = i;
                    pos[1] = j;
                }
        return pos;                
    }
    
    static int TraversalMostDiagonal(int arr[][]) //(3.1)//
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

    static int TraversalHourglass(int arr[][])
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

    static int TraversalRhombus(int arr[][])
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