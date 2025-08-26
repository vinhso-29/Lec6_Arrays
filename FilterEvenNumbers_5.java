package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterEvenNumbers_5 {

    public static ArrayList<Integer> getEvenNumbers(int[] numbers) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        return evens;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> evenList = getEvenNumbers(arr);

        // Print results
        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Even Numbers ArrayList: " + evenList);
    }
}
