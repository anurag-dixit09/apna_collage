package apna_collage;
import java.util.*;
import java.util.Scanner;

public class AK_12_Strings {

    public static void main(String[] args) {
        /*String name = " tony";
        String fullname= " Tony Stark";
        String sentence= " My name is Tony Stark ";
        */
        Scanner sc = new Scanner(System.in);
        /*String a = sc.next();
        */
        // use for to take full line input
        /*String a = sc.nextLine();
        System.out.println(" your name is :"+a);
        */
//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------
        
        // concatanation - addition of strings +
        /*
        String firstname = "Tony";
        String lastname= "Stark";
        String fullname = firstname+ " " + lastname ;
        System.out.println(fullname);
        */
        
//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------

        // length string name.length();
        /*
        System.out.println(fullname.length());
        */
//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------
        
        //charAt asing index
        /*
        for( int i = 0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }*/
//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------
        //1 s1 > s2: +ve
        //2 s1 < s2: -ve
        //1 s1 == s2: 0
        //comparing 2 strings - string1compareTo(string2)
    
    /*
        String name1= "tony";
        String name2= "tony";
        if( name1.compareTo(name2) ==0) {
            System.out.println("strings are equal");

        }
        else{
            System.out.println("strings are not equal");
        }
        */
//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------
// strings are immutale
        String sentence="Tony Stark";

        String name = sentence.substring(0,4);
        System.out.println( name);
    }
}