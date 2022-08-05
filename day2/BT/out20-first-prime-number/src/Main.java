import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        System.out.print("so lg so nguyen to can in ra: ");
        int number = scan.nextInt();
        int N = 2;
        int count = 0;
        boolean check = true;
        while (count != number) {
            check = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                }
            }
            if (check){
                System.out.printf("%d\n",N);
                count++;
            }
            N++;
        }
    }




//        for (int i = 2; i < number; i++) {
//            if (N % i == 0 && i < Math.sqrt(N)){
//                count++;
//            }
//            if (count == 2){
//                System.out.printf("%d", N);
//                N++;
//            }
//        }
}

