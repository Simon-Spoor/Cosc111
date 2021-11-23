import java.util.Scanner;

public class Q3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = input.nextInt();
        int reverse = 0;
        reverseInt(n, reverse);
        
        input.close();
    }
    static void reverseInt(int n, int reverse) {
        int nReference = n;
        while(n != 0) {
            int i = n % 10;
            reverse = reverse * 10 + i;
            n /= 10;
          }
        if (nReference == reverse) {System.out.println(nReference + " is a palindrome");}
        else {System.out.println(nReference + " is not a palindrome");}
        
    }
}
