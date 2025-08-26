
package Lec6_Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ToDoListManagement_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- TO-DO LIST MENU ---");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task by index");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks in the list.");
                    } else {
                        System.out.println("Your tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.print("Enter the index of the task to remove: ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < tasks.size()) {
                            tasks.remove(index);
                            System.out.println("Task removed!");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}


