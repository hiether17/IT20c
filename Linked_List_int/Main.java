
package Linked_List_int;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

        // Adding elements to the list
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println("Current Linked List:");
        list.printList();
        
        //Delete
        System.out.println();
        System.out.println("Deleting 2 from the list...");
        System.out.println("Current Linked List:");
        list.deleteByValue(50);
        list.printList();
        
   }
}