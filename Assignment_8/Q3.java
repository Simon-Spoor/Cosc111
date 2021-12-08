import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] provinces = {"British Columbia", "Alberta", "Saskatchewan", "Manitoba", "Ontario", "Quebec", "Newfoundland & Labrador","Nova Scotia", "New Brunswick", "Prince Edward Island"};
        String[] capitals = {"Victoria", "Edmonton","Regina","Winnipeg","Toronto","Quebec City", "St. John's", "Halifax", "Fredericton", "Charlottetown"};

        int ansCorrect = 0;
        for (int i = 0; i < provinces.length; i++){
            System.out.println("What is the capital of " + provinces[i] + "?");
            String ans = input.nextLine();
            if (ans.equalsIgnoreCase(capitals[i])){ansCorrect += 1;}
        }
        System.out.println("You got " + ansCorrect + " question(s) Right");
        input.close();
    }
}
