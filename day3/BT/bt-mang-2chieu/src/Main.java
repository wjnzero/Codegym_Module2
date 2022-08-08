import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m, n, vt;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();
        System.out.println("Nhập vào vị trí cột của ma trận cần tính tổng: ");
        vt = scanner.nextInt();


        int A[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < m; i++) {
                sum+= A[i][vt];
        }

        int sumDC = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumDC += A[i][j];
                }
            }
        }

        System.out.println("Ma trận vừa nhập: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }



        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
        System.out.println("Tổng gt ở cột "+vt+" là: " + sum);
        System.out.println("Tổng gt ở đường chéo chính là: " + sumDC);
    }
}