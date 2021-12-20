import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int chosenNum = input.nextInt();
     Boolean isprime = true;
     
     for (int i = 2; i < chosenNum; i++){
        if (chosenNum % i == 0) { isprime = false; }
     }
     if (isprime) { System.out.println("Prime"); }
     else { System.out.println("Not Prime"); }

     input.close();
    }
    
}
