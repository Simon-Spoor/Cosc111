import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
      System.out.println("Enter the time in seconds");
      toTime();
    }
    static void toTime(){
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int hours;
      int minutes;
      int seconds;
      seconds = n % 60;
      minutes = (n/60) % 60;
      hours = (n/60)/60;

      System.out.println(hours + ":" + minutes + ":" + seconds);
            
      input.close();
    }
  }
  