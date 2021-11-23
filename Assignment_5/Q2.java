public class Q2 {
    public static void main(String[] args) {
        for (int num = 1, s = 0; num < 10000; num++) {
            s = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    s += (i);
                }
            }
            if (s == num) {System.out.println(num);}
        }

    }
}