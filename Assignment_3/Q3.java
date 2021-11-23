import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 999 (inclusive): ");
        int num = input.nextInt();
        int dig1 = num % 10;
        int dig2 = ((num % 100) - dig1) / 10;
        int dig3 = (num - dig1 - dig2) / 100;
        
        int alldigits = dig1 + dig2 + dig3;
        System.out.println("The sum of all digits in " + num + " is " + alldigits);
        input.close();
    }
}
