public class Q4 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int count = countPerfectSquares(a, b);
    System.out.printf("Range [%d,%d] has %d of Perfect Squares.", a, b, count);
  }
  public static int countPerfectSquares(int n1, int n2) {
    int count = 0;
    for (int i = n1; i <= n2; i++)
      if (isPerfectSquare(i))
        count++;
    return count;
  }
  private static boolean isPerfectSquare(int num) {
    int sq = (int) Math.sqrt(num);
    return (sq * sq == num);
  }

}