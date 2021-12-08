public class Q5 {
    public static void main(String args[]){
        int x = 1;
        if ((x > 1) & (x++ < 10));
        System.out.println(x);

        x = 1;
        if ((x > 1) && (x++ < 10));
        System.out.println(x);

        x=1;
        if ((1 == x) | (10 > x++));
        System.out.println(x);

        x=1;
        if ((1 != x) || (10 > x++));
        System.out.println(x);
    }
    
}
