package CircleAndCylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double r, String color, double height) {
        super(r, color);
        this.height = height;
    }

    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }
    public double calV(){
        return calS()*height;
    }

    @Override
    public String toString() {
        return  "Cylinder{" +
                "r= "+getR()+
                "height=" + height +
                "V= "+calV()+
                '}';
    }
}
