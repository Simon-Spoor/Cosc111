public class Q4 {
    public static void main(String[] args) {
        Fan defaultFan = new Fan();
        Fan myFan = new Fan(10, true, 10.0, "yellow");
        
        System.out.println("Default fan: \n" + defaultFan.toString());
        System.out.println("My fan: \n" + myFan.toString());
    }
}

class Fan {
    private int speed;
    private boolean isOn;
    private double radius;
    private String colour;
    
    public Fan(){
        this.speed = 1;
        this.isOn = false;
        this.radius = 5.0;
        this.colour = "blue";
    }

    public Fan(int speed, boolean isOn, double radius, String colour){
        setValues(speed,isOn,radius,colour); 
    }

    public void setValues(int s, boolean i, double r, String c){
        speed = s;
        isOn = i;
        radius = r;
        colour = c;
    }

    public int getSpeed(){
        return speed;
    }

    public boolean getOn(){
        return isOn;
    }

    public double getRadius(){
        return radius;
    }

    public String getColour(){
        return colour;
    }

    public String toString(){
        String y = "";
        if (isOn) { y = "on, Speed: " + this.getSpeed();} else { y = "off"; }

        String x = ("Fan Colour: " + this.getColour() + ", Radius: " + this.getRadius() + ", fan is " + y);
        return x;
    }

}
