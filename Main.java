import sort.BubbleSort;
import utils.Visualizer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {8, 3, 5, 2};

        System.out.println("Original Array:");
        Visualizer.showArray(arr, -1, -1); // No highlights yet

        BubbleSort.sort(arr);

        System.out.println("After sorting:");
        Visualizer.finalDisplay(arr);
    }
}
