
package ArrayList;
      import java.util.ArrayList;
  
public class ItemManager {
   
     private ArrayList<String> items;
       
       public ItemManager(){
           items = new ArrayList<>();
         }
       
       public void displayItems(){
           System.out.println("Names our list: " +items);
         }
       
       public void addName(String item){
           items.add(item);
           System.out.println("Names: " +items);
         }
       
       
       public void updateItem(int index, String newItem){
           if(index >=0 && index < items.size()){
               String olditem = items.set(index, newItem);
               System.out.println("Successfully Updated:" + olditem + "to" + newItem);
           }
           else{
               System.out.println("Index out of Bounds");
           }
       }
       /*added a function to find the items that the user wants to find in the list using if-else statement*/
       public void findItem(String itemfind){
           int index = items.indexOf(itemfind);
           if (index != -1){
               System.out.println("found: " + itemfind + " at index" + index);
           }
           else
           {
               System.out.println(itemfind + "not found");
           }
       }
/*Added a function to delete the items depending on the index number that the user wants to delete*/
public void deleteItems(int index){
if (index >=0 && index <items.size()){
    String removedItem = items.remove(index);
    System.out.println("successfully Deleted: " + removedItem);
}else{
    System.out.println("Index out of Bounds");
        }
    }
}
