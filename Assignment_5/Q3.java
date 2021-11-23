public class Q3 {
    public static void main(String[] args) {
        int c = 0;

        for (int i = 100; i <= 200; i++) {
            if ((i % 5 == 0) ^ (i % 6 == 0)) {
                System.out.print(i + " ");
                c++;
                if (c == 10){System.out.print("\n"); c = 0;}
            }

        }

    }
}
/*
Write a program to find all the numbers between 100 and 200 that are divisible by
either 5 or 6 but not both (this is called XOR relationship). Your program must display 10
numbers per line with exactly one space between 2 numbers.
*/