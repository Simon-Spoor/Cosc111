import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter plate numbers");
        String licencePlate = input.nextLine();
        int length = licencePlate.length();

        char c2 = licencePlate.charAt(2);

        //Long if statement ):
        //I'm sorry
        if (Character.isUpperCase(licencePlate.charAt(0)) && Character.isUpperCase(licencePlate.charAt(1))) {
            if (Character.isAlphabetic(licencePlate.charAt(0)) && Character.isAlphabetic(licencePlate.charAt(1)) && Character.isDigit(licencePlate.charAt(3)) && Character.isDigit(licencePlate.charAt(4)) && c2 == '-' && length == 5) {
                System.out.println(licencePlate + " is a valid licence plate");
            }
        } else {
            System.out.println(licencePlate + " is not a valid licence plate");
        }
        input.close();
    }
}