import java.sql.Time;

public class QuadraticEquation {
    double a,b,c;

//    public QuadraticEquation(){}

    public QuadraticEquation(double a, double b, double c){
        this.a  =   a;
        this.b  =   b;
        this.c  =   c;

    }

/*
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
*/

    public double getDiscriminant(){
        double delta;
        delta = b*b-4*a*c;
        return delta;
    }

    public double getRoot1(double delta){
        double r1;
        if (delta < 0){
            return 0;
        }
        r1 = (-b+Math.pow(delta,0.5))/2*a;
        return r1;
    }
    public double getRoot2(double delta){
        double r2;
        if (delta < 0){
            return 0;
        }
        r2 = (-b-Math.pow(delta,0.5))/2*a;
        return r2;
    }
}
