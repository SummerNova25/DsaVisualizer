import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("✨ Welcome to DSA Visualizer ✨");
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");

        int choice = sc.nextInt();
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long startTime = System.nanoTime();

        switch(choice) {
            case 1:
                SortingAlgorithms.bubbleSort(arr);
                break;
            case 2:
                SortingAlgorithms.selectionSort(arr);
                break;
            case 3:
                SortingAlgorithms.insertionSort(arr);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        long endTime = System.nanoTime();
        System.out.println("Sorted array:");
        for(int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nTime taken: " + (endTime - startTime)/1_000_000.0 + " ms");
        sc.close();
    }
}
