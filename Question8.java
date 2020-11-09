package Assignment;

import java.util.Scanner;


public class Question8 
{
    public static void main(String args[])
    {
        int[] numbers = {5,3,4,20,1,8,9,10};
        Scanner scanf = new Scanner(System.in);
        
        System.out.println("Enter an integer value");
        int value = scanf.nextInt();
        int output = 0;
        
        for(int i = 0; i < numbers.length; i++)
        {
             if (numbers[i]==value)
             {
                output = 1;
                break;
             }
             else
             {
                output = 0;         
             }
        }
        if(output == 1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}

