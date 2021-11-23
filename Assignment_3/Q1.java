import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in fahrenheit between -58 and 41 F");
        double ta = input.nextDouble();
        System.out.println("Enter the wind speed in miles per hour (Must be greater than or equal to 2)");
        double v = input.nextDouble();
        double tw = 35.74 + 0.6215 * ta - 35.74 * Math.pow(v , 0.16) + 0.4275 * ta * Math.pow(v , 0.16);
        System.out.println("The wind chill index is " + tw);
        input.close();
    }
}
