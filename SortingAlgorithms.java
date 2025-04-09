public class SortingAlgorithms {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        System.out.println("Visualizing Bubble Sort:");
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.println("Comparing: " + arr[j] + " and " + arr[j+1]);
                if (arr[j] > arr[j+1]) {
                    System.out.println("Swapping: " + arr[j] + " and " + arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        System.out.println("Visualizing Selection Sort:");
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                System.out.println("Comparing: " + arr[j] + " and " + arr[minIdx]);
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            System.out.println("Swapping: " + arr[i] + " and " + arr[minIdx]);
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        System.out.println("Visualizing Insertion Sort:");
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                System.out.println("Shifting: " + arr[j]);
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            System.out.println("Inserting: " + key);
            arr[j + 1] = key;
        }
    }
}
