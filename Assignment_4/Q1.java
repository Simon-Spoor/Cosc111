import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter");
        String letter = (input.nextLine());
        letter = letter.toUpperCase();
        
        //TODO: this is a bad way to do this
        switch (letter){
            case "A": case "E": case "I": case "O": case "U": case "Y":
            System.out.println(letter + " is a vowel"); break;
            case "B": case "C": case "D": case "F": case "G": case "H": 
            case "J": case "K": case "L": case "M": case "N": case "P": 
            case "Q": case "R": case "S": case "T": case "V": case "W": 
            case "X": case "Z":
            System.out.println(letter + " is a consonant"); break;
            default: 
            System.out.println(letter + " is not a valid character"); break;
        }

        input.close();
    }

}