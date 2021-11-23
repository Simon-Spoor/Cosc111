import java.util.Scanner;

public class Q2 {
    static double side1 = 0;
    static double side2 = 0;
    static double side3 = 0;
    static double s = 0; 
    static boolean isBigger = false;

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("input 3 sides of a triangle in double");
    side1 = input.nextDouble();
    side2 = input.nextDouble();
    side3 = input.nextDouble();

    triangleSideLengthCheck();
    if (isBigger) {triangeArea();}

    input.close();
    }
    static void triangleSideLengthCheck() {
        s = (side1 + side2 + side3)/2;
        if ((side3 < (side1 + side2))&&(side2 < (side3 + side2))&&(side1 < (side3 + side2))) {isBigger = true;}
        else {System.out.println("Invalid Input");}
    }
    static void triangeArea() {
    double area = Math.sqrt( s * (s - side1) * (s - side2) * (s - side3));
    System.out.println("The area is: " + area);
    }
}