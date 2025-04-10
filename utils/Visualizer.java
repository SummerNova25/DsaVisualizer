package utils;

public class Visualizer {

    private static int stepCounter = 1;

    public static void showArray(int[] arr, int highlight1, int highlight2) throws InterruptedException {
        System.out.println("\n== Step " + stepCounter++ + " ==");
        drawVerticalBars(arr, highlight1, highlight2);
        Thread.sleep(1000); // Adjust for speed
    }

    public static void finalDisplay(int[] arr) {
        System.out.println("\n== Sorted Array ==");
        drawVerticalBars(arr, -1, -1); // No highlights
        System.out.println("\nSorting Complete!");
    }

    private static void drawVerticalBars(int[] arr, int highlight1, int highlight2) {
        int max = findMax(arr);

        for (int level = max; level >= 1; level--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= level) {
                    if (i == highlight1 || i == highlight2) {
                        System.out.print("\u001B[31m|\u001B[0m "); // Red for swapped
                    } else {
                        System.out.print("█ ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Print bottom values
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            max = Math.max(max, val);
        }
        return max;
    }
}
