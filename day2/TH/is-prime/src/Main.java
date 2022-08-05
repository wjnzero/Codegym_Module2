import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        System.out.print("input number: ");
        int number = scan.nextInt();
        if (number < 2){
            System.out.printf("%d is not a prime", number);
        }
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.printf("%d is a prime", number);
            }
            else System.out.printf("%d is not a prime", number);
        }
    }
}