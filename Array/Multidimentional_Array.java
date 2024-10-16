
package Array;

public class Multidimentional_Array {
    public static void main(String[] args) {
        //inputs for the array
        String [][] arrays = {
            {".", "?", "<", ">", "/"},
            {"/", "0", ",", "<", ">"},
            {".", "-", "0", "/", "?"},
            {"<", ",", "?", "-", ">"} 
        };
        // a nested for loop to make the array multidimensional 
        for (int i=0; i < arrays.length; i++){
            for (int j=0; j < arrays[i].length; j++){
                System.out.println(arrays[i][j]);
            }
            System.out.println(" ");
        }

    }
}
