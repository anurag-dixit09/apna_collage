package apna_collage;
import java.util.*;
public class AK_04_Loops{
    public static void main(String[] args) {
        //--------------------------------------------------------------------
        /*
        for(int i = 0; i<=6; i++){
            System.out.println("Hello world");
        }
        */
        /*/
        for(int i = 0; i=6; i++){
            System.out.println(i);
        }
        */
        //-------------------------------------------------------------------
        //-------------------------------------------------------------------
        //WHILE LOOP
        /*int i = 1;
        while(i<=10) {
            System.out.println(i);
            i= i+1;
        }
        */
        //-------------------------------------------------------------------
        //--------------------------------------------------------------------
        // DO WHILE LOOP
        /*
        int i= 0;
        do{
            System.out.println(i);
            i++;
        }while(i<11);
        */
        //-------------------------------------------------------------------
        //-----------------------QUESTION----------------------------------------
        // DIFFERENCE B/W WHILE AND DO WHILE LOOP

        /*int i =11;
        while(i<=10) {
            System.out.println("Apna Collage");
            i++;
        }
        */
        //-------------------------------------------------------------------
        //----------------------------------------------------------------------
        /*
        int i = 12;
        do{
            System.out.println("Apna Collage");
            i++;
        }while(i<11);
        */
        //-------------------------------------------------------------------
        //------------------QUESTION--------------------------------------------
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n number: ");
        int n= sc.nextInt();
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum= sum+i;
        }
        System.out.println(sum);
    }
}
//-------------------------------------------------------------------
//-------------------------------------------------------------------