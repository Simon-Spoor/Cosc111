import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        double distance;
        double miles_per_gallon;
        double price_per_gallon;
        double driving_cost;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance in miles");
        distance = input.nextDouble();

        System.out.println("Enter the miles per gallon");
        miles_per_gallon = input.nextDouble();

        System.out.println("Enter the price in $ per gallon");
        price_per_gallon = input.nextDouble();

        driving_cost = (Math.floor(distance / miles_per_gallon * price_per_gallon * 100.00)/100.00); 
        //I decided to round it to 2 decimal places because there can't be a thousandth of a dollar and it was bothering me

        System.out.println("The cost of driving is $" + (driving_cost)); 

        input.close();
    }
}

