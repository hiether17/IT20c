
package ArrayList;
  import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        //Creating object of the class to access all the method on the ItemManager
        ItemManager list = new ItemManager();
        
        //Inializing variables
        String item, newItem, finditem; int index;
        
        //Display the list
        list.displayItems();
        
         //To read and store the input in the variable named index
        System.out.println("Enter an index number that you want to change: ");
        index = sc.nextInt();
        //Calling so that it reads the input of the next (String) line
        sc.nextLine();
        //To read and store the input in the variable named newItem
        System.out.println("Enter a new name that you want to change on that index number: ");
        newItem = sc.nextLine();
        
    }
} 

