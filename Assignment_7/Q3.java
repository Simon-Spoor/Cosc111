import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        System.out.println("How many values in the array?:");
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        double[] listx = new double[length];
        for (int i = 0; i < listx.length; i++) {
            System.out.println("Enter value " + i);
            listx[i] = input.nextDouble();
        }
        isSorted(listx);
        input.close();
    }
    public static boolean isSorted(double[] list) {
        double[] listSort = new double[list.length];

        for (int i = 0; i < list.length; i++) {
            double x = list[i];
            listSort[i] = x;
        }
        Arrays.sort(listSort);


        boolean sorted;

        if (Arrays.equals(list, listSort)) {
            sorted = true;
            System.out.println("This list is already sorted");
        } else {
            System.out.println("This list is not sorted");
            sorted = false;
        }
        return sorted;

    }

}