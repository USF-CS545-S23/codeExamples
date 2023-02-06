package sorting;

import java.util.Arrays;

public class SortingExercise {

    public static void swap(int ind1, int ind2, int[] arr) {
        int tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexOfMin = i;
            //search for min from index = i to length - 1,
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            // swap it with the element at index i
            swap(i, indexOfMin, arr);

        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int pos = 0; pos < n - 1; pos++) {
            // start at the end and go to pos, comparing neighboring elements
            // and swapping them as needed
            // This will bubble the smallest element to the top
            // FILL IN CODE
            int j = n  - 1;
            while (j > pos) {
                if (arr[j] < arr[j-1]) {
                    swap(j, j-1, arr);
                }
                j--;
            }

        }
    }

    public static void insertionSort(int[] arr) {
        int curr;
        int j;
        for (int i = 1; i < arr.length; i++) { // iterates over unsorted part of the list
            curr = arr[i];      // insert curr into the sorted part of the list
            j = i - 1;  // last element in the sorted part
            while(j >= 0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                j--;
            }
            // FILL IN CODE
            arr[j + 1] = curr;
        }
    }

    /** Merge two sorted arrays into one sorted array
     *
     * @param arr1 sorted array 1
     * @param arr2 sorted array 2
     * @return  sorted array that has elements from arr1 and arr2
     */
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        // FILL IN CODE
        // initialize i, j, k

         // Repeat:
        // compare elements arr[i] and arr[j], and depending on
        // which one is smaller, place the element in result at index k,
        // and increment either i or j
        // Increment k

        return result;
    }


    /** Merge two sorted subarrays: the one that starts at index low and ends at mid=(low+high)/2,
     * and the other that starts at mid+1 and ends at high (inclusive)
     * @param arr array of integers
     * @param temp temporary array
     * @param low index of the first element in the sorted subarray 1
     * @param mid index of the last element in the sorted subarray 1
     * @param high index of the last element in the sorted subarray 2
     */
    public static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        // FILL IN CODE
        // initialize i, j, k
        // while k <= high
        // compare elements and merge

    }

    public static void main(String[] args) {
        //int[] arr = {5, 10, 6, 1, 8};
        //System.out.println(Arrays.toString(arr));
        // selectionSort(arr);
        // bubbleSort(arr);
        //insertionSort(arr);
        int[] arr1 = {1, 6, 8, 10, 100, 215};
        int[] arr2 =  {2, 4, 9, 14};
        int[] res = merge(arr1, arr2);
        System.out.println(Arrays.toString(res));

        /*int[] arr = {1, 6, 8, 10, 100, 2, 4, 9, 14};
        int[] temp = new int[arr.length];
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        merge(arr, temp, low, mid, high);
        System.out.println(Arrays.toString(arr));
         */
    }
}
