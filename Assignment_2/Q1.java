import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        double original_velocity;
        double final_velocity;
        double time;
        double acceleration;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter original velocity");
        original_velocity = input.nextDouble();

        System.out.println("Enter final velocity");
        final_velocity = input.nextDouble();

        System.out.println("Enter time");
        time = input.nextDouble();

        acceleration = (final_velocity - original_velocity) / time;
        System.out.println("The average acceleration is " + acceleration + "m/s/s");

        input.close();
    }
}
