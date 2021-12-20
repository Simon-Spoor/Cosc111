public class Q3 {
    public static void main(String[] args) {
         cow a = new cow();
         cow b = new cow();
         cow c = new cow();
         farmer d = new farmer("Mark", 150.2, 33, 44);
         farmer g = new farmer("Harold", 222.3, 21, 30);
         farmer w = new farmer();
         farmer.farmerMeeting();
         d.petAllCows(cow.numOfCows);
         w.work();
        }
}
class cow{
    public static int numOfCows = 0;
    cow(){
        setvalue(1);
    }
    public void setvalue(int newCow){
        numOfCows += newCow;
    }
}
class farmer{
    private String name;
    private double weight;
    private int x;
    private int y;
    private boolean awake;
    private String mood;
    public static int numberOfFarmers;

    public farmer(){
        name = "John";
        weight = 200;
        x = 0;
        y = 0;
        awake = true;
        mood = "Happy";
        setValues(name, weight, x, y, 1);
    }

    public farmer(String name, double weight, int x, int y){
        setValues(name, weight, x, y, 1);
    }

    public void setValues(String n, double w, int x1, int y1, int num){
        name = n;
        weight = w;
        x = x1;
        y = y1;
        numberOfFarmers +=1;
    }

    public static void farmerMeeting(){
        int x = (int)(Math.random()*3);
        System.out.println(x);
        String y = "";
        if (x == 0) {y = "corn"; }
        else if (x == 1) {y = "cows"; }
        else  {y = "tractors"; }

        System.out.println(farmer.numberOfFarmers + " farmers meet and talk about " + y);
    }

    public void work(){
        int x = (int) (Math.random()*10);
        if (x == 0){ 
            this.mood = "Tired";
            System.out.println("Farmer " + this.name + " is tired now!");
        }
    }

    public void petAllCows(int cowNum){
        this.mood = "Happy";
        for (int i = 0; i < cowNum; i++){
            System.out.println("Farmer " + this.name + " pets cow #" + (i+1));
        }
        System.out.println("Farmer " + this.name + " is happy now!");
    }
    
    public void wakeup(){}
    public void sleep(){}
}