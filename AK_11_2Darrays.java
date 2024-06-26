package apna_collage;
import java.util.*;

public class AK_11_2Darrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:"); // Corrected the spelling of "columns"
        int columns = sc.nextInt(); // Corrected the spelling of "columns"
        int[][] numbers = new int[rows][columns]; // Corrected the variable name "colomns" to "columns"
        
        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // for Columns
            for (int j = 0; j < columns; j++) { // Declared and initialized j
                numbers[i][j] = sc.nextInt();
            }
        }
        /*
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        */
        int x = sc.nextInt();

        for(int i =0; i<rows; i++) {
            for( int j= 0; j<columns; j++) {
                if(numbers[i][j]== x){
                    System.out.println("x found at (" + i +", " +j +")" );
                }
            }
        }
    }
}