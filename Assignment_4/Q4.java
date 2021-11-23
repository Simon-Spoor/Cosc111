import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rock (0), Paper(1), or Scissors(2)?");
        int userChoice = input.nextInt();
        int computerChoice = (int)(Math.random()*3);


        switch(userChoice){
            case 0:
                if (computerChoice == 0)    {System.out.println("You and the computer both chose Rock. \nDraw");    }
                if (computerChoice == 1)    {System.out.println("You chose Rock, the computer chose Paper. \nYou Lose");}
                if (computerChoice == 2)    {System.out.println("You chose Rock, the computer chose Scissors. \n You Win!");}
                break;
            case 1:
                if (computerChoice == 0)    {System.out.println("You chose Paper, the computer chose Rock. \nYou Win!");    }
                if (computerChoice == 1)    {System.out.println("You and the computer both chose Paper. \nDraw");}
                if (computerChoice == 2)    {System.out.println("You chose Paper, the computer chose Scissors. \nYou Lose");}
                break;
            case 2:
                if (computerChoice == 0)    {System.out.println("You chose Scissors, the computer chose Rock. \nYou Lose");    }
                if (computerChoice == 1)    {System.out.println("You chose Scissors, the computer chose Paper. \n You Win!");}
                if (computerChoice == 2)    {System.out.println("You and the computer both chose Scissors. \nDraw");}
                break;
            default: System.out.println("Invalid input"); break;
        }
        input.close();
    }
}