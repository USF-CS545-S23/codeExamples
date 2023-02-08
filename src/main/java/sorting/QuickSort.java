package sorting;

public class QuickSort {
    public static void swap(int ind1, int ind2, int[] arr) {
        int tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }

    public static void quickSort(int arr[]) {
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * Implementation of quick sort
     * @param arr array of integers
     * @param low the index of the first element of the subarray we are sorting
     * @param high the index of the last element of the subarray we are sorting
     */
    private static void quickSort(int arr[], int low, int high) {
        int pivotIndex;
        if (low < high) {
            pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /**
     * A helper method used in quick sort.
     * Partitions the subarray from low to high using the mid point as the pivot.
     * @param arr input array
     * @param low  the index of the first element of the subarray we are sorting
     * @param high the index of the first element of the subarray we are sorting
     * @return index of the pivot after the partition
     */
    private static int partition(int arr[], int low, int high) {
        int pivotIndex = (low + high) / 2;
        int pivotElement = arr[pivotIndex];
        swap(high, pivotIndex, arr);

        int i = low;
        int j = high - 1;
        while (i <= j) {
            while ((i <= j) && (arr[i] < pivotElement))
                i++;
            while ((i <= j) && (arr[j] >= pivotElement))
                j--;
            if (i <= j) {
                swap(i, j, arr);
                i++;
                j--;
            }
        }
        swap(i, high, arr);
        return i;
    }
}