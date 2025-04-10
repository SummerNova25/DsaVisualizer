package sort;

import utils.Visualizer;

public class BubbleSort {
    public static void sort(int[] arr) throws InterruptedException {
        int n = arr.length;
        boolean swapped;
        int swapCount = 0;

        int totalSteps = (n * (n - 1)) / 2;  // Rough max comparisons
        int currentStep = 1;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    swapCount++;

                    double progress = (currentStep * 1.0) / totalSteps;
        int barWidth = 20;
        int filled = (int) (progress * barWidth);
        StringBuilder bar = new StringBuilder("Progress: [");
        for (int k = 0; k < barWidth; k++) {
            if (k < filled) bar.append("█");
            else bar.append("-");
        }
        bar.append("] ").append((int)(progress * 100)).append("%");
        System.out.println(bar);
                    Visualizer.showArray(arr, j, j + 1);
                }
                currentStep++;
            }

            if (!swapped) break;
        }

        // Optional: show swap summary
        System.out.println("\nTotal swaps made: " + swapCount);
    }
}
