package comparable;
import java.util.Comparator;
public class CompareableCircle extends Circle implements Comparable{
    private double radius;
    private String color;
    private boolean filled = true;
    public CompareableCircle () {}
    public CompareableCircle ( double radius) {
        this.radius=radius;
    }
    public CompareableCircle (double radius, String color, boolean filled) {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public int compareTo(CompareableCircle o) {
        if (getRadius()>o.getRadius()) return 1;
        else if (getRadius()<o.getRadius()) return -1;
        else return 1;
    }
}

