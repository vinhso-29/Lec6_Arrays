
package Lec6_Arrays;
import java.util.Scanner;
public class FindTheSecondLargestElement_11 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15, 20};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;  
                largest = num;            
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;      
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second-largest element is: " + secondLargest);
        }
    }
}


