import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        System.out.print("input width: ");
        double width = scan.nextDouble();
        System.out.print("input height: ");
        double height = scan.nextDouble();
        Rectangle hcn = new Rectangle(width, height);

        System.out.println("Your Rectangle \n"+ hcn);
        System.out.println("Perimeter of the Rectangle: "+ hcn.getPerimeter());
        System.out.println("Area of the Rectangle: "+ hcn.getArea());

    }
}