package Assignment;

import java.util.Arrays;


public class Question7 
{
    public static void main(String[] args) 
    { 
        
        int[] array = {5,3,4,20,1,8,9,10}; 
        
        System.out.print("Unsorted array is: "); 
        for(int i = 0; i < array.length ; i++ )
        {
            System.out.print(array[i]+", ");
        }
  
        Arrays.sort(array); 
  
        System.out.print("\nSorted array is: ");
        for(int i = 0; i < array.length ; i++ )
        {
            System.out.print(array[i]+", ");
        }
    } 
}
