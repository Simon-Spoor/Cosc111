import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        Random generate = new Random();
        int i1 = generate.nextInt(2);
        char letter1 = (char) (generate.nextInt(26) + 'a');
        if (i1 > 0) {letter1 = Character.toUpperCase(letter1);}

        int i2 = generate.nextInt(2);
        char letter2 = (char) (generate.nextInt(26) + 'a');
        if (i2 > 0) {letter2 = Character.toUpperCase(letter2);}

        int i3 = generate.nextInt(2);
        char letter3 = (char) (generate.nextInt(36) + 'a');
        if (i3 > 0) {letter3 = Character.toUpperCase(letter3);}

        int num1 = generate.nextInt(9);
        int num2 = generate.nextInt(9);
        int num3 = generate.nextInt(9);

        System.out.println(letter1 +""+ letter2 +""+ letter3 +""+ num1 +""+ num2 +""+ num3);
    }
}
