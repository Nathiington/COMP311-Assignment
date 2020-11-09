package Assignment;
//package that handles inputs from users
import java.util.Scanner;

public class Question5 
{
    //main function
    public static void main(String args[])
    {
        //keyword declaration to get input from the user 
        Scanner scanf = new Scanner(System.in);
        //input is taken here
        System.out.println("Enter text: ");
        String text = scanf.nextLine();
       
        String reversetext;
        // this line converts input text into reverse using the reverse() function
        reversetext = new StringBuffer(text).reverse().toString();
        //this output is to confirm that the text is in reverse
        System.out.println(reversetext);
        
        //conditional statement checks
        if(text.equals(reversetext))
        {
            System.out.println("This is a palindrome");
        }
        else
        {
            System.out.println("This is not a palindrome");
        }
    }
}
