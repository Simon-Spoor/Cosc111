import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length of 3 sides of a Triangle");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (side1 >= 0 && side2 >= 0 && side3 >= 0) {
            if ((side1 + side2 > side3) | (side1 + side3 > side2) | (side2 + side3 > side1)) {
                System.out.println("The perimeter of your Triangle is " + (side1 + side2 + side3));
            }
        } 
        else {
            System.out.println("Input is invalid");
        }
        
        input.close();

    }
}