package Assignment;

import java.util.Scanner;


public class Question2 
{
    public static void main(String args[])
    {
         //input statements
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter matrix elements");
        
        //declaration of 2D 3 x 3 array
        double[][] arr = new double[3][3];
        
        //loop that inputs to the array
        //rows
        for (int x = 0; x < 3; x++) 
        {
            //columns
            for (int y = 0; y < 3; y++) 
            {
                //input of each element
                arr[x][y] = scanf.nextDouble();
                 
            }
        }
        //formula that calculates the determinant of a 3 x 3 matrix
        double det = (arr[0][0]*((arr[1][1]*arr[2][2])-(arr[2][1]*arr[1][2])))  -(arr[0][1]*((arr[0][1]*arr[2][2])-(arr[2][0]*arr[1][2])))  +(arr[0][2]*((arr[1][0]*arr[2][1])-(arr[1][1]*arr[2][0])));
        //output
        System.out.println("The determinant is: " + det);
    }
}
