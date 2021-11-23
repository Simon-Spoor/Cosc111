import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    String s1 = "Enter number of students: ";
    String s2 = "Enter student grades: ";
    double[] numbers = getNumsFromUser(s1, s2);
    System.out.println(Arrays.toString(numbers));
   }
   

  public static double[] getNumsFromUser(String msg1, String msg2) {
    Scanner input = new Scanner(System.in);
    System.out.println(msg1);
    int studentNum = input.nextInt();

    System.out.println(msg2);
    double[] numbers = new double[studentNum];
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Enter the grade for student " + (i+1));
      double x = input.nextDouble();
      numbers[i] += x;
    }   
    input.close();
    return numbers;   
  }
}