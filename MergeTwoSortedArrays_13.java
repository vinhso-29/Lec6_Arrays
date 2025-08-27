
package Lec6_Arrays;
import java.util.Arrays;
public class MergeTwoSortedArrays_13 {
    public static int[] mergeSorted(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];

        int i = 0; 
        int j = 0;
        int k = 0; 

        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = a2[j++];
            }
        }

        while (i < a1.length) {
            result[k++] = a1[i++];
        }

        while (j < a2.length) {
            result[k++] = a2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 4, 6};
        int[] a2 = {2, 3, 5};

        int[] merged = mergeSorted(a1, a2);
        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}
