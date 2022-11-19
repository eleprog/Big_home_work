package com.mycompany.task_1_4;

public class Task_1_4 
{   
    static int MostFrequentValue(int[] arr)
    { 
        if(arr != null)
        {
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
        return -1;
    }
    
    public static void main(String[] args) 
    {
        int[] array = {0,1,2,3,4,5,6,7,8,8};
        System.out.println(MostFrequentValue(array));
    }
}
