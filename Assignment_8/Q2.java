import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int[][] m1 ={ { 14, 11, 13, 12 },{ 18, 15, 13, 13 },{ 19, 16, 15, 17 } };
        int[][] m2 = { { 54, 53, 51, 52 },{ 51, 59, 52, 56 },{ 53, 54, 52, 58 } };

        System.out.println("First array:");
        displayArray(m1);

        System.out.println("Second array:");
        displayArray(m2);

        addMatrix(m1,m2);

        int x = 0;
        sumCol(m1, x);
    }
    public static int sumCol(int[][] m, int colIdx){
        Scanner input = new Scanner(System.in);
        
        int collNum = 4; 
        if (collNum > 3){System.out.println("Input a collumn number (0-3): "); collNum = (input.nextInt());}

        for (int i = 0; i < m.length; i++){
            colIdx += m[i][collNum];
        }
        System.out.println("The sum of the values in collumn " + collNum + " of array m1 is " + colIdx);
        input.close();
        return colIdx;
    }

    public static int[][] addMatrix(int[][] a, int[][] b){
        int[][] m3 = new int[3][4];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length;j++){
                int x = a[i][j];
                int y = b[i][j];
                m3[i][j] = (x+y);
            }
        }
        System.out.println("\nThe added values of the arrays above are: ");
        displayArray(m3);
        return m3;       
    }
    public static void displayArray(int[][] m) {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++)
                System.out.print(m[r][c] + " ");
            System.out.println();
        }
    }
    
}