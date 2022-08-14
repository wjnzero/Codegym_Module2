import CircleAndCylinder.Circle;
import CircleAndCylinder.Cylinder;
import Point23d.Point2D;
import Point23d.Point3D;
import TriangleAssignment.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        Circle tron = new Circle(9.8, "ghi");
//        System.out.println(tron);
//
//        Circle tru = new Cylinder(9.8, "ghi",6.9);
//        System.out.println(tru);

//        Point3D p2 = new Point3D(4.0f,6.0f,8.0f);
//        System.out.println(p2);
//        for (float cc: p2.getXYZ()
//             ) {
//            System.out.println(cc);
//        }
        double a,b,c;
        String color;

        Scanner scanner = new Scanner(System.in);

        System.out.print("input color: ");
        color = scanner.nextLine();
        System.out.print("input side1: ");
        a = scanner.nextDouble();
        System.out.print("input side2: ");
        b = scanner.nextDouble();
        System.out.print("input side3: ");
        c = scanner.nextDouble();
        Triangle tg = new Triangle(color,a,b,c);
        System.out.println(tg);
    }
}