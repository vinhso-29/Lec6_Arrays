
package Lec6_Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class UnlimitedDataEntry_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        System.out.println("Enter integers (enter -1 to stop):");

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break; 
            }
            numbers.add(num);
            sum += num;
        }

        System.out.println("Numbers entered: " + numbers);
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}


