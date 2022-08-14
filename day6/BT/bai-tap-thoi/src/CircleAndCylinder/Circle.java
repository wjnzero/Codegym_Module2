package CircleAndCylinder;

public class Circle {
    private double r;
    private String color;

    public Circle() {
    }

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }
    public double calS(){
        return r*r*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", color='" + color + '\'' +
                "s2= "+calS()+
                '}';
    }
}
