import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        MyList<String> lit = new MyList<>();
////        lit.ensureCapacity(0);
//        for (int i = 0; i < 3; i++) {
//            System.out.printf("lit[%s]= ",i);
//            Scanner cc = new Scanner(System.in);
//            lit.add(cc.nextLine());
//        }
//        lit.remove(2);
//        System.out.println(lit);
//        System.out.println(lit.size());
//        Object lit1 = lit.clone();
//        System.out.println(lit1);
//        System.out.println(lit.contains("hung"));
//        System.out.println(lit.indexOf("hung"));
//        System.out.println(lit.get(1));
//        lit.clear();
//        System.out.println(lit);
        MyLinkedList<String> lit = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            System.out.printf("lit[%s]= ",i);
            Scanner cc = new Scanner(System.in);
            lit.add(cc.nextLine());
        }
        System.out.println(lit);


    }
}