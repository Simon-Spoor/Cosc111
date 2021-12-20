import java.util.Arrays;
import java.util.Scanner;

public class SortingPractice {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int i = 0;
        while (i < array.length) {

            if (i == 0) 
                i++;

            if (array[i] >= array[i - 1]) {i++;}

            else {
                int temp = 0;
                temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i--;
            }
        }


        System.out.println(Arrays.toString(array));
        input.close();

    }
}