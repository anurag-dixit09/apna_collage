package apna_collage;
import java.util.*;
public class AK_15_Bits {

    public static void main(String[] args) {
        int n = 5; //0101
        int pos= 1;
        int bitMask = 1<< pos;
        /*
        if((bitMask & n)== 0) {
            System.out.println(" bit is Zero");
        }
        else{
            System.out.println("bit is one");
        }
        */
        int newNumber = bitMask | n;
        
    }
}
