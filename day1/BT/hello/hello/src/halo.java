import java.util.Scanner;

public class halo {
    public static void main(String[] args) {
        System.out.print("your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.printf("Hello: %s",name);
    }
}
