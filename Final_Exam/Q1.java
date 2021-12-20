import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //GET USER INPUT
        System.out.println("Enter two positive integers");
        int n1 = input.nextInt();
        if (n1 < 0){
            System.out.println("Please enter a positive integer");
            n1 = input.nextInt();
        }
        int n2 = input.nextInt();
        if (n2 < 0){
            System.out.println("Please enter a positive integer");
            n2 = input.nextInt();
        }

        //DETERMINE STARTING VALUE FOR COUNTER
        int i = 0;

        if (n1 > n2) { i = n2; } else { i = n1; }

        //DETERMINE GREATEST COMMON DIVISOR
        boolean GCDFound = false;
        while (!GCDFound){
            if ((n1 % i == 0) && (n2 % i == 0)){
                GCDFound = true;
                break;
            }
            i--;
        }

        //PRINT ANSWER
        System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is: " + i);
        input.close();
    }
}