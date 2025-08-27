
package Lec6_Arrays;
import java.util.Arrays;
import java.util.ArrayList;
public class RemovingElementsFromAnArrayListDuringIteration_14 {
    public static void main(String[] args) {        
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 60, 25, 80, 5, 95));
        
        for(int i = numbers.size() - 1; i >= 0; i--) {
            if(numbers.get(i) > 50) {
                numbers.remove(i);
            }
        }
        
        System.out.println("Resulting list: " + numbers);
    }
}
