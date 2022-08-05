import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        double money, rate;
        double lai = 0;
        int month;

        Scanner in = new Scanner(System.in);

        System.out.print(" in so tien vay: ");
        money = in.nextDouble();
        System.out.print("\n in so thang vay: ");
        month = in.nextInt();
        System.out.print("\n in lai xuat: ");
        rate = in.nextDouble();

        for (int i = 0; i < month; i++) {
            lai += money * (rate/100)/12 * month;
        }
        System.out.printf("phai tra %.2f VND",lai);
    }
}