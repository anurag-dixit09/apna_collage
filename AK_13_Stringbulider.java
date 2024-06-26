package apna_collage;
import java.util.*;
public class AK_13_Stringbulider {

    public static void main(String[] args) {
        //StringBuilder sb = new StringBuilder("Tony");
        //System.out.println(sb);
        // char at index
       // System.out.println(sb.charAt(0));
//-------------------------------------------------------------
//-------------------------------------------------------------

    // setCharAt use to change charecter
        /*
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        */
//-------------------------------------------------------------
//-------------------------------------------------------------

        //Insert a charecter
        /*
        sb.insert(2, 'n');
        System.out.println(sb);
        */

//-------------------------------------------------------------
//-------------------------------------------------------------

        // delete
        /*
        sb.delete(2, 4);
        System.out.println(sb);
        */
//-------------------------------------------------------------
//-------------------------------------------------------------
    
    // to append -to add new string
    /*
    StringBuilder sb = new StringBuilder("H");
    sb.append("e");
    sb.append("l");
    sb.append("l");
    sb.append("o");
    System.out.println(sb);
    System.out.println(sb.length());
    */
//-------------------------------------------------------------
//-------------------------------------------------------------
    StringBuilder sb = new StringBuilder("Hello");
    for(int i = 0; i<sb.length()/2; i++){
        int front = i;
        int back = sb.length() -1 -i;
        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);
        sb.setCharAt(front, backChar);
        sb.setCharAt(back, frontChar);
        
        }
        System.out.println(sb);
    
    }
}