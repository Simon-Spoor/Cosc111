import java.util.Scanner;


public class Q1 {
    public static void main(String[] args) {
        int numItemsCheck;


        //USER INPUT TAKEN  
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will be checked");
        numItemsCheck = input.nextInt();


        //CREATE ARRAY
        int[] numTaken = new int[numItemsCheck];


        //POPULATE ARRAY
        for (int i = 0; i < numItemsCheck; i++) {
            numTaken[i] = input.nextInt();
        }


        //FIND IF NUMBERS ARE PRIME
        int isPrime = 1; //FOR SOME REASON THIS WOULD NOT WORK WITH A BOOLEAN
        for (int i = 0; i < numTaken.length; i++) {
            isPrime = 0;
            for (int j = 2; j < numTaken[i]; j++) {
                if (i % j == 0) {
                    isPrime = 1;
                }
            }
            if (isPrime == 1) {
                System.out.println(numTaken[i] + " is not a prime number");
            } else {
                System.out.println(numTaken[i] + " is a prime number");
            }
        }



        input.close();
    }
}