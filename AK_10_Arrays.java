package apna_collage;
import java.util.*;
public class AK_10_Arrays {
    public static void main(String[] args) {
        //int [] marks = new int[3];
        
        /*marks[0]= 97;
        marks[1]= 98;
        marks[2]= 95;*/
        /*
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        */
//---------------------------------------------------------------------        
//---------------------------------------------------------------------        
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter size");
        int size = sc.nextInt();
        int numbers[]= new int[size];

        for(int i= 0; i<size ; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i<size; i++) {
            System.out.println(numbers[i]);
        }
        */
//---------------------------------------------------------------------        
//---------------------------------------------------------------------        
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter size: ");
        int size = sc.nextInt();
        int numbers[]= new int[size];

        for(int i= 0; i<size ; i++){
            numbers[i] = sc.nextInt();
        }
        int x= sc.nextInt();

        // output
        for(int i = 0; i<size; i++) {
            if(numbers [i]==x) {
                System.out.println("x found at: "+ i);
            }
        }
        // this searchig is called linear search

    }
}
//---------------------------------------------------------------------        
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^END^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//---------------------------------------------------------------------        
