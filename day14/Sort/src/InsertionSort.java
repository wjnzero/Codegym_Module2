public class InsertionSort {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
//            System.out.println("vitri: "+pos+"co gt la: "+ x);
            while(pos > 0 && x < array[pos-1]){
                System.out.println();
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }
    public static void insertionSortDemo(int[] array){
        int pos, x;
        int arrtem[] = array;
        System.out.println("mang hien tai:");
        printListD(arrtem);
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            System.out.println("\nvi tri list["+pos+"] co gt la: "+ x);
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                System.out.println("gia tri "+x+" < "+array[pos-1]);
                System.out.println("doi cho "+"list["+pos+"]"+"= list["+(pos-1)+"]");
                pos--;
            }
            System.out.println("mang hien tai:");
            printListD(array);
            array[pos] = x;
        }
    }
    public static void printListD(int[] list){
        for (int j : list) System.out.print(j + " ");
    }
}
