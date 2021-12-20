public class Q1 {
    public static void main(String[] args) {
        cuboid Cuboid_1 = new cuboid();
        cuboid Cuboid_2 = new cuboid(8,3.5,5.9,"Green");

        System.out.println("Cuboid 1\n" + Cuboid_1.displayInfo());
        System.out.println("Cuboid 2\n" + Cuboid_2.displayInfo());
    }
    
}

class cuboid {
    private double l;
    private double w;
    private double h;
    private String colour;
    
    public cuboid(){
        this.l = 1;
        this.w = 1;
        this.h = 1;
        this.colour = "White";
    }
    public cuboid(double l, double w, double h, String colour) {
        setValues(l, w, h, colour);
    }
    public double getLength(){
        return l;
    }
    public double getWidth(){
        return w;
    }
    public double getHeight(){
        return h;
    }
    public String getColour(){
        return colour;
    }
    public void setValues(double length, double width, double height, String c){
        l = length;
        w = width;
        h = height;
        colour = c;
    }
    public double getSurfaceArea(){
        return  2*(this.l*this.w + this.l*this.h + this.h*this.w);
    }
    public double getVolume(){
        return this.l*this.w*this.h;
    }
    public String displayInfo(){
        return "" + "Color: " + this.getColour() + "\nDimensions: " + this.getLength() +" "+ this.getWidth() +" "+ this.getHeight() +"\nSurface Area: " + this.getSurfaceArea() + "\nVolume " + this.getVolume() + "\n";
    }

}
