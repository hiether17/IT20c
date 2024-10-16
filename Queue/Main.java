
package Queue;
   import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
    Queue customerQueue = new Queue();
        Scanner scanner = new Scanner(System.in);
        String choice;
         
         do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve customer");
            System.out.println("3. Display queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            
         switch (choice) {
                case "1":
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    customerQueue.enqueue(new Costumer(name));
                    break;

                case "2":
                    customerQueue.dequeue();
                    break;

                case "3":
                    customerQueue.displayQueue();
                    break;

                case "4":
                    System.out.println("Thankyou. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        } while (!choice.equals("4"));

        scanner.close();
    }
}

