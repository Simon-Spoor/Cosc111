import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    String s1 = "Enter number of students: ";
    String s2 = "Enter student grades: ";
    double[] numbers = getNumsFromUser(s1, s2);
    //System.out.println(Arrays.toString(numbers));
    showLetterGrades(numbers);
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

  //This is probably bad
  public static void showLetterGrades(double[] grades){
    double[] gradesUnsorted = new double[grades.length];
    int[] s = new int[grades.length];

    for (int i = 0; i < grades.length; i++){
      double x = grades[i];
      gradesUnsorted[i] = x;
    }    
    Arrays.sort(grades);

    for (int i = 0; i < grades.length; i++){
      for (int j = 0; j < grades.length; j++){
        if (grades[i] == gradesUnsorted[j]){
          s[i] = j;
    }}}

    double bestGrade = grades[grades.length -1];
    System.out.println(bestGrade);
    double A = bestGrade - 10;
    double B = bestGrade - 10;
    double C = bestGrade - 10;
    double D = bestGrade - 10;

    for (int i = 0; i < s.length; i++){
      System.out.print("Student " + s[i] + "'s score is " + grades[i] + " and grade is ");
      if (grades[i] > A){ System.out.print("A\n");}
      else if (grades[i] > B){ System.out.print("B\n");}
      else if (grades[i] > C){ System.out.print("C\n");}
      else if (grades[i] > D){ System.out.print("D\n");}
      else { System.out.print("F\n");}
    }

    System.out.println(Arrays.toString(grades));
    System.out.println(Arrays.toString(s));
  }
}