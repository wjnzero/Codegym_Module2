import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice > -2) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("4. Draw tam giác vuông botton-left");
            System.out.println("5. tam giác vuông top-left");
            System.out.println("6. tam giác can");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            if ((i == 1 && j > 4) || (i == 2 && j > 3) || (i == 3 && j > 2) || (i == 4 && j > 1) || (i == 5 && j > 0)){
                                System.out.print(" ");
                            }
                            else {
                                System.out.print("*");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.out.println("tam giác vuông botton-left");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 5:
                    System.out.println("tam giác vuông top-left");
                    System.out.println("tam giác vuông botton-left");
                    for (int i = 6; i >= 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 6:
                    System.out.println("tam giác caan");
//                    for (int k = 0; k < 1; k++) {
//                        for (int i = 0; i < 6; i++) {
//                            for (int j = 0; j < i; j++) {
//                                System.out.print("*");
//                            }
//                            System.out.print("\n");
//                        }
//                        for (int i = 6; i >= 0; i--) {
//                            for (int j = 1; j <= i; j++) {
//                                System.out.print("*");
//                            }
//                            System.out.print("\n");
//                        }
//                    }
                    int length = 3;
                    int dem = 1;
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length*2; j++) {
                            if ((i == 0 && j == length) || (i == 1 && j >=2 && j <= 4)
                            || (i == 2 && j >=1 && j <= 5)){
                                System.out.print("*");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

