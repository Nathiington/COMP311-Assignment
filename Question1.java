package Assignment;
//package to get input
import java.util.Scanner;

public class Question1 
{

    public static void main(String[] args) 
    {
        //input statements
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter matrix elements");
        
        //declaration of 2D 2 by 2 array
        double[][] arr = new double[2][2];
        
        //loop that inputs to the array
        //rows
        for (int x = 0; x < 2; x++) 
        {
            for (int y = 0; y < 2; y++) 
            {
                //columns
                //input of each element
                arr[x][y] = scanf.nextDouble();
                 
            }
        }
        //formula that calculates the determinant of a 2 x 2 matrix
        double det = (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);
        //output
        System.out.println("The determinant is: " + det);

    }
}
