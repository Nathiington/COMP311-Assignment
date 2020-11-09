package Assignment;

public class Question9 
{
    //main function
    public static void main( String args[])
    {
        //declaration and initialisation of numbers array
        int[] numbers = {5,3,4,20,1,8,9,10};
        //declaration of dummy value for highest
        int highest = 0;
        
        //loop condition which maps through the array
        //numbers.length is used to have a flexible loop dependent on number of values in array
        for(int i =0; i < numbers.length ; i++)
        {
            //conditional statements which checks the highest value 
           if (numbers[i]>highest)
                   {
                       highest = numbers[i];
                   }
            
        }
        //output statement
        System.out.println("The highest in the array is: " + highest);
    }
}
