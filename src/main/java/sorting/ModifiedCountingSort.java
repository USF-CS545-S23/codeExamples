package sorting;
import java.util.Arrays;

public class ModifiedCountingSort {
    public static void modifiedCountingSort(Elem[] a, int maxValue) {
        // assume the range of keys is from 0 to maxValue
        int[] counting = new int[maxValue+1];
        // Initialize all the linked lists
        for (int i = 0; i < a.length; i++)
            counting[a[i].getKey()]++;


        // Modify the counting array
        for (int k = 1; k <= maxValue; k++)
            counting[k] = counting[k] + counting[k-1];
        // System.out.println(Arrays.toString(counting));

        // Add elements to b in sorted order
        Elem[] b = new Elem[a.length];
        for (int j = a.length - 1; j >= 0; j--) {
            int index = --counting[a[j].getKey()];
            b[index] = a[j];
        }

        // Copy elements back to a
        for (int j = 0; j < b.length;j++) {
            a[j] = b[j];
        }
    }

    public static void main(String[] args) {
        Elem[] elements = {
                new Elem(4, "A"), new Elem(0, "B"),
                new Elem(2, "C"), new Elem(4, "D"),
                new Elem(0, "E"), new Elem(1, "F"),
                new Elem(4, "G"), new Elem(5, "H"),
        };
        modifiedCountingSort(elements, 5);
        System.out.println(Arrays.toString(elements));
    }
}
