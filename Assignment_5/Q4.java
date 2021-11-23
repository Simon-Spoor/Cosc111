import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number of students");
    int i = input.nextInt();

    String nameTemp;
    String nameFirst = "";
    String nameSecond = "";

    int scoreTemp;
    int scoreFirst = 0;
    int scoreSecond = 0;

    
    for (int j = 0; j < i; j++) {
      System.out.println("Enter a name");
      nameTemp = input.next();
      System.out.println("Enter a score");
      scoreTemp = input.nextInt();

      if (scoreTemp > scoreFirst) {
        nameSecond = nameFirst;
        scoreSecond = scoreFirst;

        scoreFirst = scoreTemp;
        nameFirst = nameTemp;
      } else if (scoreTemp > scoreSecond) {
        scoreSecond = scoreTemp;
        nameSecond = nameTemp;
      }
    }

    System.out.println("Top two students:");
    System.out.println(nameFirst + "'s score is: " + scoreFirst);
    System.out.println(nameSecond + "'s score is: " + scoreSecond);

    input.close();
  }
}

/*Write a program that first asks the user to input a number of students and then asks
for each student’s name and score. The program should then display the names of the
highest scorer and the second-highest scorer. The validity of user’s input is not needed to be
checked.*/