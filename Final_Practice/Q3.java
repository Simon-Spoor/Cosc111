import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive Integer");

        int n1 = input.nextInt();
        if (n1 < 0) { System.out.println("Enter a positive Integer"); n1 = input.nextInt();}
        System.out.println("Enter a positive Integer");

        int n2 = input.nextInt();
        if (n2 < 0) { System.out.println("Enter a positive Integer"); n2 = input.nextInt();}

        int i = n1 * n2;

        boolean found = false;
        while(!found) 
        {   
            i--;
            if ((i % n1 == 0) && (i % n2 == 0)){
                found = true;                
            }        
        }
        System.out.println(i);
        input.close();
    }
}
