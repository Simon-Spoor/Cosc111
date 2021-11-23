import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int all = 0;
        int counter = -1;
        int negative = 0;
        int positive = 0;
        int even = 0;
        int odd = 0;

        int notzero = 1;

        while (notzero == 1) {
            System.out.println("Enter an integer (0 to terminate");
            i = input.nextInt();
            all += i;
            counter++;

            if ((i % 2) == 0) {even++;} 
            else {odd++;}

            if (i>0) {positive++;}
            else if (i<0) {negative++;}
            else {notzero = 0;}
        }
        System.out.println(counter);

        double average = (all/counter);

        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The number of even numbers is " + even);
        System.out.println("The number of odd numbers is " + odd);
        System.out.println("The total is " + all);
        System.out.println("The average is " + average);
        input.close();
    }
}
 /*Write a program that allows a user to enter a number of integers until the user
inputs 0 (zero). The program then prints the total number of positive, negative, even and odd
integers that have been entered. Your program should also print the sum and average of the
input values (not counting zeros). The average should be rounded to 2 decimal places.*/