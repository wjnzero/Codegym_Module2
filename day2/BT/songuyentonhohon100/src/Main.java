

public class Main {
    public static void main(String[] args) {
        int N = 2;
//        int count = 0;
        boolean check = true;
        while (N < 100) {
            check = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                }
            }
            if (check){
                System.out.printf("%d\n",N);
//                count++;
            }
            N++;
        }
    }

}