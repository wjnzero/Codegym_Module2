import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        System.out.print("input USD: ");
        Scanner scan = new Scanner(System.in);
        double usd = scan.nextDouble();
        System.out.printf("%.0f USD = %.0f VND",usd,usd*23000);
    }
}
