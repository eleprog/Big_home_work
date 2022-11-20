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
    
    static void Write(String a, int value){
        System.out.print(a + value);
    }
    
    static void Write(String a, boolean value){
        System.out.print(a + value);
    }
    
    static void Write(String a, int[] arr)
    {
        System.out.print(a);
        if(arr != null)
            for(int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
    }
    
    static void Write(String a, String b, int[] value){
        System.out.print(a + value[0] + " " + b + value[1]);
    }
    
    static void Write(String a, String b, String c, int[] value){
        System.out.print(a + value[0] + " " + b + value[1] + " " + c + value[2]);
    }
    
    static void MenuOutput() throws FileNotFoundException, IOException
    {
        FileInputStream file = new FileInputStream("tasks.txt");
        byte[] filein = new byte[1759];
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
                int[] array5 = {0,1,2,3,4,5,6,7,8,9};             
                int type = ArrayTypeDefinition(array5);
                
                if(type == 1) System.out.println("Array increasing");
                else if(type == 0) System.out.println("All array elements are equal");
                else if(type == -1) System.out.println("Array decreasing");
                else System.out.println("Array is not ordered");
                break;
                
            case ("2.0"):
                int[] array6 = {9,8,7,6,5,4,3,2,1,0};
                BubbleSort(array6);
                Write("Sort array: ", array6);
                break;
                
            case ("2.1"):
                int[] array7 = {9,8,7,6,5,4,3,2,1,0};
                ShakerSort(array7);
                Write("Sort array: ", array7);
                break;
                
            case ("2.2"):
                int[] array8 = {9,8,7,6,5,4,3,2,1,0};
                DirectBinarySearchSort(array8);
                Write("Sort array: ", array8);
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
                int[][] matrix2 = {{1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5}};
                Write("Sum elements under secondary diagonal: ", TraversalSecondaryDiagonal(matrix2));
                break;
                
            case ("3.3"):
                int[][] matrix3 = {{1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5}};
                Write("Sum elements cross diagonal: ", TraversalСrossDiagonal(matrix3));
                break;
                
            case ("3.4"):
                int[][] matrix4 = {{1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5}};
                Write("Sum elements: ", TraversalHourglass(matrix4));
                break;
                
            case ("3.5"):
                int[][] matrix5 = {{1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5}};
                Write("Sum elements: ", TraversalRhombus(matrix5));
                break;
                
            case ("3.6"):
                int[][] matrix6 = {{1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5},
                                   {1,2,3,4,5}};
                Write("Sum elements: ", TraversalTriangle(matrix6));
                break;
                
            case ("4.0"):
                int[][] matrix7 = {{0,1,0,0,0,0},
                                   {0,0,1,0,1,0},
                                   {1,0,0,1,0,1},					 
                                   {1,0,0,0,0,1},
                                   {0,0,0,0,0,0},
                                   {0,0,0,0,0,0}};
                Write("Path found: ", SearchWay(matrix7, IntRead("First point: "), IntRead("Second point: ")));
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
            return -1;
        
        int product = arr[0];
        for(int i = 1; i < arr.length; i++)
            product *= arr[i];
        
        return product;     
    }
    
    static int MostFrequentValue(int[] arr) //(1.4)//
    { 
        if(arr == null)
            return -1;
        
        int frequentValue = arr[0];
        int frequentValueAmount = 1;
        boolean[] flags = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++)
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
        return frequentValue;  
    }
    
    static int ArrayTypeDefinition(int[] arr) //(1.5)//
    {
        if(arr == null || arr.length < 2)
            return -2;
        
        if(arr[0] == arr[1])
        {
            for(int i = 2; i < arr.length; i++)
                if(arr[i] != arr[0])
                    return -2;
            return 0;
        }
        if(arr[0] > arr[1])
        {
            for(int i = 2; i < arr.length; i++)
                if(arr[i-1] <= arr[i])
                    return -2;    
            return -1;
        }                    
        for(int i = 2; i < arr.length; i++)
            if(arr[i-1] >= arr[i])
                return -2;
        return 1;
    }
    
    static void BubbleSort(int[] arr) //(2.0)//
    {
        if(arr == null || arr.length < 2)
            return;
        
        int lastSwap = arr.length;
        while(lastSwap > 0)
        {
            int lastSwapTmp = 0;
            for(int i = 1; i < lastSwap; i++)       
                if(arr[i-1] > arr[i])
                {
                    int swapTmp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = swapTmp;
                    lastSwapTmp = i;
                }
            lastSwap = lastSwapTmp;
        }
    }
    
    static void ShakerSort(int[] arr) //(2.1)//
    {
        if(arr == null || arr.length < 2)
            return;
        
        int lastLoSwap = 0;
        int lastHiSwap = arr.length-1;
        
        while(lastLoSwap != lastHiSwap)
        {
            int lastSwapTmp = 0;
            for(int i = lastLoSwap; i < lastHiSwap; i++)
                 if(arr[i] > arr[i+1])
                 {
                     int swapTmp = arr[i];
                     arr[i] = arr[i+1];
                     arr[i+1] = swapTmp;
                     lastSwapTmp = i;
                 }
            lastHiSwap = lastSwapTmp;
            
            for(int i = lastHiSwap; i > lastLoSwap; i--)
                 if(arr[i] < arr[i-1])
                 {
                     int swapTmp = arr[i-1];
                     arr[i-1] = arr[i];
                     arr[i] = swapTmp;
                     lastSwapTmp = i;
                 }
            lastLoSwap = lastSwapTmp;           
        }
    }
    
    static void DirectBinarySearchSort(int[] arr) //(2.2)//
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
    
    static int[] MinimumElementPosition(int[][] mtrx) //(3.0)//
    {
        int[] pos = {0,0};
        if (mtrx == null)
            return pos;
        
        int tmp = mtrx[0][0]; 
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
    
    static int TraversalMostDiagonal(int mtrx[][]) //(3.1)//
    {
        int sum = 0;   
        if(mtrx == null)
            return sum; 
        for(int i = 0; i < mtrx.length; i++)
            for(int j = 0; j <= i; j++)
                sum += mtrx[i][j];
        return sum;
    }

    static int TraversalSecondaryDiagonal(int mtrx[][]) //(3.2)//
    {
        int sum = 0;   
        if(mtrx == null || (mtrx.length != mtrx[0].length))
            return sum;
        for(int i = 0; i < mtrx.length; i++)
            for(int j = 0; j <= i; j++)
                sum += mtrx[i][mtrx.length - j - 1];
        return sum;
    }
    
    static int TraversalСrossDiagonal(int mtrx[][]) //(3.3)//
    {
        int sum = 0;   
        if(mtrx == null || (mtrx.length != mtrx[0].length))
            return sum;
        
        int indexHi = mtrx.length - 1;
        for(int i = 0; i < mtrx.length / 2; i++)
        {
            sum += mtrx[i][i];  
            sum += mtrx[i][indexHi - i];
            sum += mtrx[indexHi - i][i];
            sum += mtrx[indexHi - i][indexHi - i];
        }
        if(mtrx.length % 2 == 1)
            sum += mtrx[indexHi/2][indexHi/2];
        return sum;
    }
    
    static int TraversalHourglass(int mtrx[][]) //(3.4)//
    {
        int sum = 0;   
        if(mtrx == null || (mtrx.length != mtrx[0].length))
            return sum;
        
        int indexHi = mtrx.length - 1;
        for(int i = 0; i < mtrx.length / 2; i++)
            for(int j = i; j <= indexHi - i; j++)
            {
                sum += mtrx[i][j];
                sum += mtrx[indexHi - i][j];        
            }
        
        if(mtrx.length % 2 == 1)
            sum += mtrx[indexHi/2][indexHi/2];
        return sum;
    }

    static int TraversalRhombus(int mtrx[][]) //(3.5)//
    {
        int sum = 0;
        if(mtrx == null || (mtrx.length != mtrx[0].length))
            return sum;
        
        int len = mtrx.length;
        int indexHi = mtrx.length - 1;
        
        for(int i = 0; i < len / 2; i++)
            for(int j = indexHi / 2 - i; j <= len / 2 + i; j++)
            {
                sum += mtrx[i][j];
                sum += mtrx[indexHi - i][j];
            }
        if(len % 2 == 1)
            for(int i = 0; i < len; i++)
                sum += mtrx[indexHi / 2][i];

        return sum;
    }

    static int TraversalTriangle(int mtrx[][]) //(3.6)//
    {
        int sum = 0;
        if(mtrx == null || (mtrx.length != mtrx[0].length))
            return sum;
        
        int indexHi = mtrx.length - 1;
        for(int i = 0; i < (mtrx.length + 1) / 2; i++)
            for(int j = indexHi / 2 - i; j <= mtrx.length / 2 + i; j++)
                sum += mtrx[i][j];
        
        return sum;
    }
    
    public static int[] SearchWay(int[][] arr, int pointA, int pointB) //(4.0)//
    {
        if(arr == null)
            return null;
        
        int len = arr.length;
        int [] stack = new int[len];
        int stackPointer = 0;
        boolean [] flags = new boolean[len];
        
        stack[0] = pointA;
        flags[pointA] = true;
        
        while(stackPointer >= 0)
        {      
            int tmp = -1;       
            for(int i = 0; i < len && tmp == -1; i++)
                if(arr[stack[stackPointer]][i] > 0 && !flags[i])
                {
                    tmp = i;
                    stack[++stackPointer] = i;
                    flags[i] = true;
                }
            
            if(tmp == pointB)   
            {
                int[] a = new int[stackPointer + 1];
                System.arraycopy(stack, 0, a, 0, stackPointer + 1);
                return a;
            }
            
            if(tmp == -1)
                stackPointer--;
        }   
        return null;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        MenuOutput();
        TaskSelection();
    }
}