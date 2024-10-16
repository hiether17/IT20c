
package Queue;

import java.util.LinkedList;

/**
 *
 * @author HP
 */
public class Queue {

    private LinkedList<Costumer> customers;

    public Queue() {
        customers = new LinkedList<>();
    }

    public boolean isEmpty() {
        return customers.isEmpty();
    }

    public int size() {
        return customers.size();
    }

    public void enqueue(Costumer customer) {
        customers.addLast(customer);
        System.out.println(customer.getName() + " has been added to the queue.");
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.print("Current queue: ");
            for (Costumer customer : customers) {
                System.out.print(customer.getName() + " | ");
            }
            System.out.println();
        }
    }

    public Costumer dequeue() {
        if (!isEmpty()) {
            Costumer customer = customers.removeFirst();
            System.out.println(customer.getName() + " has been served.");
            return customer;
        } else {
            System.out.println("The queue is empty.");
            return null;
        }
    }
}

