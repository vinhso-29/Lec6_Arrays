
package Lec6_Arrays;
import java.util.ArrayList;
import java.util.Arrays;
public class ConvertBetweenArrayAndArrayList_15 {
    // 1. Chuyển từ Array -> ArrayList
    public static ArrayList<String> arrayToArrayList(String[] array) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : array) {
            list.add(s);
        }
        return list;
    }

    // 2. Chuyển từ ArrayList -> Array
    public static String[] arrayListToArray(ArrayList<String> list) {
        return list.toArray(new String[0]); // toArray creates a new array
    }

    public static void main(String[] args) {
    
        String[] namesArray = {"Ann", "Bob"};
        ArrayList<String> list = arrayToArrayList(namesArray);
        System.out.println("Array to ArrayList: " + list);

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Charles", "David"));
        String[] array = arrayListToArray(namesList);
        System.out.println("ArrayList to Array: " + Arrays.toString(array));
    }
}
