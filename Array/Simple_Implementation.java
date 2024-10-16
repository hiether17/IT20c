
package Array;

/**
 *
 * @author HP
 */
public class Simple_Implementation {
    public static void main(String[] args) {
       //declaring variable inside array"
       String [] shape = {"Circle", "Triangle", "Square", "Rectangle"};
       
       
      //printing what fruit using the index inside the array
      
      System.out.println(shape[2]);
      System.out.println(shape[0]);
      System.out.println(shape[1]);
 
     
      //output
      /*Square
        Circle
        Triangle*/
      
      //declaring numbers inside array"
      int [] numValue = {95,90,85,80,75,70,65};
      
      //procedure
      System.out.println("The number inside array is : "+ numValue.length);
      
      //output
      //The number inside tha array is: 7
      
      //declaring numbers inside the array"
      int [] num = {3,5,10,12,15};
      
      //procedure
      System.out.println("Sum : "+ (num[1] + num[4]));
      System.out.println("Difference : "+ (num[2] - num[3]));
      System.out.println("Product : "+ (num[3] * num[2]));
      System.out.println("Quotient : "+ (num[4] / num[1]));
      
      //output
      /*
      Sum : 20
      Difference : -2
      Product : 120
      Quotient : 3
      */
      
      
    }
    
}
