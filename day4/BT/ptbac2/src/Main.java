import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("input a: ");
        double a = scanner.nextDouble();
        System.out.print("input b: ");
        double b = scanner.nextDouble();
        System.out.print("input c: ");
        double c = scanner.nextDouble();
        QuadraticEquation ptb2 = new QuadraticEquation(a,b,c);

        if (ptb2.getDiscriminant() > 0){
            System.out.printf("pt co 2 no x1 = %f x2 = %f",ptb2.getRoot1(ptb2.getDiscriminant()),ptb2.getRoot2(ptb2.getDiscriminant()));
        } else if (ptb2.getDiscriminant() == 0) {
            System.out.printf("pt co 1 no x = %f",ptb2.getRoot1(ptb2.getDiscriminant()));
        }
        else {
            System.out.println("ko co no dau");
        }

    }
}