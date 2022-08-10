package AccessModifier;

public class Circle {
    private final double rad = 1.0;
//    private final String color = "red";

/*
    Circle(double rad) {
        this.rad = rad;
    }
*/

    Circle() {
    }

    protected double getRad() {
        return rad;
    }

    protected double getArea() {
        return rad*rad*Math.PI;
    }
}
