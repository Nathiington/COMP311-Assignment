package Assignment;

import java.util.Scanner;


public class Question4 
{
    public static void main(String args[])
    {
        Scanner scanf = new Scanner(System.in);
        
        //getting the dimensions of the matrix from the user
        System.out.println("Input the number of rows: ");
        int x = scanf.nextInt();
        System.out.println("Input the number of columns: ");
        int y = scanf.nextInt();
        
        //declaring the array and getting matrix elements from the user
        int[][] arr = new int[x][y];
        System.out.println("Enter matrix elements");
        //rows
        for (int i = 0; i < x; i++) 
        {
            //columns
            for (int j = 0; j < y; j++) 
            {
                //input of each element
                arr[i][j] = scanf.nextInt();
                 
            }
        }
        
         //getting the dimensions of the vector from the user
        System.out.println("Enter dimensions for a vector");
        System.out.println("Input the number of rows: ");
        int a = scanf.nextInt();
        System.out.println("Input the number of columns: ");
        int b = scanf.nextInt();
        
        //declaring the array and getting vector elements from the user
        int[][] vec = new int[a][b];
        System.out.println("Enter vector elements");
        //rows
        for (int i = 0; i < a; i++) 
        {
            //columns
            for (int j = 0; j < b; j++) 
            {
                //input of each element
                vec[i][j] = scanf.nextInt();
                 
            }
        }
        //multiplying  matrix and vector to get the product
        int[][] product = new int[x][b];
        for(int m = 0; m <x; m++) {
            for (int n = 0; n < b; n++) {
                for (int o = 0; o < a; o++) {
                    product[m][n] += arr[m][o] * vec[o][n];
                }
            }
        }
        
        //to display product
        for (int i = 0; i < x; i++) 
        {
             System.out.println(" ");
            //columns
            for (int j = 0; j < y; j++) 
            {
                //output
                System.out.print(product[i][j]+" ");
                 
            }
        }
         System.out.println();
    }
}
