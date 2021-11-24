import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class fnord2 {
    public static void main(String[] args) {
        //CREATE ARRAY AND LIST
        int[][] baseArray = {
            {
                1,
                2,
                3
            },
            {
                4,
                5
            },
            {
                6,
                7,
                8
            }
        };
        ArrayList < Integer > list = new ArrayList < Integer > ();


        String arrayValuesPrevious = Arrays.deepToString(baseArray);


        //ARRAY TO LIST
        for (int i = 0; i < baseArray.length; i++) {
            for (int j = 0; j < baseArray[i].length; j++) {
                int x = baseArray[i][j];
                list.add(x);
            }
        }


        //SHUFFLE LIST
        Collections.shuffle(list);


        //LIST TO ARRAY
        for (int i = 0, c = 0; i < baseArray.length; i++) {
            for (int j = 0; j < baseArray[i].length; j++) {
                baseArray[i][j] = list.get(c);
                c++;
            }
        }


        //PROOF IT WORKS
        System.out.println("The old array was:\n" + arrayValuesPrevious);
        System.out.println("The new array is:\n" + Arrays.deepToString(baseArray));


    }


}