package Assignment;
//package that handles inputs from users
import java.util.Scanner;

public class Question6 
{
    // function to print the character and its frequency in order of its occurrence
    static void frequencyCounter(String str) 
    {

        //26 in array freq for 26 lowercase letters in the alphabet
        int[] frequency = new int[26];
        //to output the first character
        System.out.println("First character is: " + str.charAt(0) );
        //to output the last character
        System.out.println("Last character is: " + str.charAt(str.length()-1) );
        
        //to output each indivisual character and frequency in a string
        System.out.println("Frequency per letter is: ");
        //loop for mapping through the text
        for (int i = 0; i < str.length(); i++) 
        {
            frequency[str.charAt(i) - 'a']++;
        }
        //loop for increasing the frequency per letter
        for (int i = 0; i < str.length(); i++) 
        {
            
            //to output the characters in the string with at least 1 value and not the entire alphabet
            if (frequency[str.charAt(i) - 'a'] != 0) 
            {
                // to print the character along with its frequency
                //university
                System.out.println(str.charAt(i) + " " + frequency[str.charAt(i) - 'a']);

                // update frequency of str.charAt(i) to avoid repition of the same character in the output
                frequency[str.charAt(i) - 'a'] = 0;
            }
        }
    }
    
    //main function
    public static void main(String args[]) 
    {
        //keyword declaration to get input from the user
        Scanner scanf = new Scanner(System.in);

        //input is taken here
        System.out.println("Enter text");
        String str = scanf.nextLine();

        //calling the function
        frequencyCounter(str);
    }
}



