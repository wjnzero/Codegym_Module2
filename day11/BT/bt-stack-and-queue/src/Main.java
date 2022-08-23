
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static final int DEFAULT = 10;

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        daoSo();


        Stack<String> stack = new Stack<>();
        StringBuilder hug = new StringBuilder("hugDepTraiVcl");
        int leng = hug.length();
        for (int i = 0; i < hug.length(); i++) {
            stack.push(String.valueOf(hug.charAt(i)));
        }
        hug.delete(0,hug.length());
        for (int i = 0; i < leng; i++) {
            hug.insert(i,stack.pop());
        }
//        hug.reverse();
        System.out.println(stack);




    }

    private static void daoSo() {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <DEFAULT; i++) {
            list.add(i);
        }
        for (Integer i:list
             ) {
            stack.push(i);
        }
        list.clear();
        for (int i = 0; i < DEFAULT; i++) {
            list.add(stack.pop());
        }
        System.out.println(list);
    }
}