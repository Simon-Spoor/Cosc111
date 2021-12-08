public class Q1 {
    public static void main(String[] args) {
        int[][] m1 ={ { 14, 11, 13, 12 },{ 18, 15, 13, 13 },{ 19, 16, 15, 17 } };
        int[][] m2 = { { 54, 53, 51, 52 },{ 51, 59, 52, 56 },{ 53, 54, 52, 58 } };

        System.out.println("First array:");
        displayArray(m1);

        System.out.println("Second array:");
        displayArray(m2);

        addMatrix(m1,m2);
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