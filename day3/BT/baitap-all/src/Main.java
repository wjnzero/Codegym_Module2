import java.sql.Array;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int vitri = 3;//Scan
        int arr1[] = {10,4,6,7,8,6,0,-3,0};
        int arr2[] = {1998,1997};
//        deleteInt(arr1,7);

//        if (vitri <=-1 && vitri >= arr1.length){
//            System.out.println("? viTri");
//        }

//        insertInt(arr1,99, vitri);

//        for (int a:arr1
//             ) {
//            System.out.printf("%d\t",a);
//        }

//        mergeArr(arr1, arr2);

        int min = minArr(arr1);
        System.out.println("The smallest element in the array is: " + arr1[min]);
    }

    public static int[] deleteInt(int arr1[], int x) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == x){
                for (int j = i; j < arr1.length-1; j++) {
                    arr1[j] = arr1[j+1];
                }
                break;
            }
        }
        return arr1;
    }

    public static int[] insertInt(int arr1[], int x, int vitri) {
        for (int i = 0; i < arr1.length; i++) {
             if (i == vitri){
                 for (int j = arr1.length-1; j > vitri; j--) {
                     arr1[j] = arr1[j-1];
                 }
                 arr1[i] = x;
                 break;
            }

        }
        return arr1;
    }

    public static void mergeArr(int arr1[], int arr2[]) {
        int arr3[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }
        for (int a:arr3
        ) {
            System.out.printf("%d\t",a);
        }
        }
    public static int minArr(int array[]) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}