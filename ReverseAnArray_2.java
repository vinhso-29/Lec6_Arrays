package Lec6_Arrays;

import java.util.Scanner;

public class ReverseAnArray_2 {

    public static void reverse(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        reverse(arr);

        System.out.print("Array after reversal: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
