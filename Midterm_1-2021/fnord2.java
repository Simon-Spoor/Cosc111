import java.util.Scanner;

public class fnord2 {
    public static void main(String args[]) {
        //Enter variables
        Scanner input = new Scanner(System.in);
        System.out.println("Enter variable a: ");
        double a = input.nextDouble();
        System.out.println("Enter variable b: ");
        double b = input.nextDouble();
        System.out.println("Enter variable c: ");
        double c = input.nextDouble();

        //Squared portion of equation
        //Used to check stuff later
        double rootcheck = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        //The rest of the quadratic equation
        double ans1 = ((0-b) + rootcheck) / (2 * a);
        double ans2 = ((0-b) - rootcheck) / (2 * a);

        //Later
        if (rootcheck > 0){
            System.out.println("The 1st root is: " + ans1);
            System.out.println("The 2nd root is: " + ans2);       
        }
        else if (rootcheck==0) {System.out.println("The root is: " + ans1);}
        else{
            System.out.println("There are no roots");
        }
        
        input.close();
    }
}