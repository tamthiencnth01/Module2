public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return height*super.getRadius()*super.getRadius()*Math.PI;
    }
    public String toString(){
        return "A Cylinder with height = "+getHeight()+", which is a subclass of "+super.toString();
    }
}
