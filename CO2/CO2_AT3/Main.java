public class Main {

    // Optimized Bubble Sort (Ascending Order)
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {

            // Flag to check if swapping happened
            boolean swapped = false;

            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap if left element is greater
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop if array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Print array
    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 9, 2, 5, 1};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}