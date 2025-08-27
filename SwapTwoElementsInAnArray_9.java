
package Lec6_Arrays;
import java.util.Arrays;
public class SwapTwoElementsInAnArray_9 {
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        System.out.println("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        swap(numbers, 0, 2);

        System.out.println("\nArray after swap: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

