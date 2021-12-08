//Setup so that it works when you run it
import java.util.Scanner;
public class Q1 {
    public static void main(String args[]) {   
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        //This is the conditional statement 
        boolean leap = ((year % 4 == 0) & !(year % 100 == 0)) || (year % 400 == 0) ? true : false;

        //Print output and close scanner
        System.out.println(leap);
        input.close();
    }
}