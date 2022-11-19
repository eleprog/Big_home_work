package com.mycompany.task_0_0;
import java.util.Scanner;

public class Task_0_0 
{
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

    public static void main(String[] args) 
    {
        Scanner myScnr = new Scanner(System.in);    
        System.out.print("Enter A: ");
        int a = myScnr.nextInt();     
        System.out.print("Enter B: ");
        int b = myScnr.nextInt();
        System.out.print("Enter C: ");
        int c = myScnr.nextInt();

        int[] value = SmallIncreaseTwoLargeDecreaseTwo(a, b, c);
        
        System.out.print("\nA: " + value[0] + "  B: " + value[1] + "  C: " + value[2]);
    }
}
