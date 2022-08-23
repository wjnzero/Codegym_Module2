import java.util.List;

public class BinarySearch {
    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
    static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length-1;
        while (high>=low){
            int mid =(low+high)/2;
            if (key<list[mid])
                high=mid-1;
            else if (key==list[mid])
                return mid;
            else low=mid+1;
        }
        return -1;
    }
    static Integer binarySearch(List<Integer> list, int gt){
        int low = 0;
        int high = list.size()-1;
        while (high>=low){
            int mid =(low+high)/2;
            if (gt< list.get(mid))
                high=mid-1;
            else if (gt== list.get(mid))
                return mid;
            else low=mid+1;
        }
        return -1;
    }
    static int forSearch(List<Integer> list, int gt){
        int vt = 0;
        for (int i = 0; i <= list.size(); i++) {
            if (list.get(i)==gt)
            {
                return list.get(i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,11));
    }
}
