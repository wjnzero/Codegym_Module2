public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        StopWatch stopWatch = new StopWatch();
        stopWatch.StartTime();
        stopWatch.start();
        SelectionSort ob = new SelectionSort();
        int arr[] = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime()+"s");

    }
}