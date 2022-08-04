package strygwyr;

import java.util.Scanner;

public class xy {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Width: ");
        width = scan.nextFloat();

        System.out.print("Enter Height: ");
        height = scan.nextFloat();
        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
