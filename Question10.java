package Assignment;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;


public class Question10 
{
   public static void main (String args[])
    {
        //to read from a separate file
        try
        {
        //these lines are to identify the numbers.txt file and specifically read from it
        File numbersFile = new File("./src/Assignment/numbers.txt");
        Scanner scanf = new Scanner(numbersFile);
        
        //an arraylist to store the values in the file
        ArrayList<Double> values = new ArrayList<>();
        
        //this loop is to map through to the end of the file searching for doubles and adds them to the arraylist
        while(scanf.hasNextDouble())
        {
            double x = scanf.nextInt();
            values.add(x);
        }
            //to stop reading from the file
            scanf.close();
            
            //sorting the largest,smallest numbers
            double sum = 0;
            double smallest = values.get(0);
            double largest = values.get(0);


            for (double x: values)
            {
                sum = sum + x;
                if (x < smallest)
                {
                    smallest = x;
                }

                if (x > largest)
                {
                    largest = x;
                }
            }
            
            //calculating sum and average
            double count = values.size();
            double average = sum/count;
            DecimalFormat z = new DecimalFormat("##.00");
            
            //to write the results in a different file called results.txt
            File resultsFile = new File("./src/Assignment/results.txt");
            
            FileWriter writer = new FileWriter(resultsFile);

            writer.write("Sum number is: "+ sum + "\n");
            writer.write("Smallest number is: " + smallest + "\n");
            writer.write("Largest number is: " + largest + "\n");
            writer.write("Average number is: " + z.format(average) + "\n");
            //stop writing
            writer.close();
            System.out.println("File Created");
        }
        catch(IOException error)
        {        
            System.out.println("error");
        }
        
    }
}


