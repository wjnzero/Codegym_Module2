public class Main {
    public static void main(String[] args) {
//        MyList<Integer> listInteger = new MyList<Integer>();
//        listInteger.add(1);
//        listInteger.add(2);
//        listInteger.add(3);
//        listInteger.add(3);
//        listInteger.add(4);
//
//        System.out.println("element 4: "+listInteger.get(4));
//        System.out.println("element 1: "+listInteger.get(1));
//        System.out.println("element 2: "+listInteger.get(2));
//
////        listInteger.get(-1);
////        System.out.println("element -1: " + listInteger.get(-1));
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.add(9,9);
        ll.add(7,1);
        ll.printList();

    }
}