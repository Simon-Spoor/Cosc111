import java.util.Scanner;

public class fnord3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        String s = (input.next());
        char x = s.charAt(0);
        System.out.println(x);
        input.close();
    }
    
}
