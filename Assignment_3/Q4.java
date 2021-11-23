import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //choose number
        System.out.println("Choose a number");
        double num = input.nextDouble();
        //add number
        System.out.println("add a number to your number");
        num += input.nextDouble();
        //multiply number
        System.out.println("multiply your number by number of your choosing");
        num *= input.nextDouble();
        //add 2 to the number
        num++;
        ++num;
        //multiply by 2 
        num = num * 2;
        //divide by 3
        num = num / 3;
        //print number
        System.out.println("your new number is " + num);
        input.close();
    }
}