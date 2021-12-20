import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        //CREATE ARRAY
        int[][] matrix = new int[10][10];

        //POPULATE ARRAY
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random()*99);
            }
        }

        //PRINTS ARRAY
        System.out.println(Arrays.deepToString(matrix));
    }
    
    
}
