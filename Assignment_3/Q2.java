import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a real number:");
        double num = input.nextDouble();
        int num2 = (int) num;
        double num3 = num - num2;
        System.out.println("Integer part: " + num2);
        System.out.println("Fraction part: " + num3);
        input.close();
    }
}

