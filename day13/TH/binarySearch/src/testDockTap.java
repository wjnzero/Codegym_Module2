import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class testDockTap {
    static long n = 2000000000;
    public static void main(String[] args) {
//        sumFor();
//        sumFunction();
        List<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list1.add(i);
        }
        long startTime =System.currentTimeMillis();
        System.out.println(BinarySearch.binarySearch(list1,9999));
//        System.out.println(BinarySearch.forSearch(list1,9999));
        long endTime =System.currentTimeMillis();
        System.out.println("phep toan thuc hien het:"+(endTime-startTime)+" milliseconds");


    }

    private static void sumFor() {
        long sum = 0;
        long startTime =System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        long endTime =System.currentTimeMillis();
        System.out.println("kq la :"+sum+"vong for thuc hien het "+(endTime-startTime)+" milliseconds");
    }
    private static void sumFunction() {
        long sum = 0;
        long startTime =System.currentTimeMillis();
        sum = n*(n+1)/2;
        long endTime =System.currentTimeMillis();
        System.out.println("kq la :"+sum+" phep toan thuc hien het "+(endTime-startTime)+" milliseconds");
    }
}
