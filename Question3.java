package Assignment;
//package that handles inputs from users
import java.util.Scanner;

public class Question3 
{
    //main function
    public static void main(String args[])
    {
        //keyword declaration to get input from the user  
        Scanner scanf= new Scanner(System.in);
        
        //this section covers a-c
        //input is taken here
        System.out.println("Enter value for a");  
        int a = scanf.nextInt();
        //input is taken here
        System.out.println("Enter value for b"); 
        int b = scanf.nextInt();
        //input is taken here
        System.out.println("Enter value for c"); 
        int c = scanf.nextInt();
        //output statement
        System.out.println("Quadratic equation will be: "+a+"x^2 +" + b+"x +"+c);
        //this section covers d
        System.out.println("Derivative of the equation is: 2ax + b");
        System.out.println("Which is: "+(2*a)+"x +"+b);
        
        //this section covers e
        //input for x is taken here
        System.out.println("Enter a value for x: ");
        float x = scanf.nextFloat();
       
        //calculations for result are done here
        float result = ((2*a)*x)+b ;
        
        //output statement
        System.out.println("The result of 2ax +b = "+result);
        
    }
}
