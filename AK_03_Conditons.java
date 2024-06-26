package apna_collage;
import java.util.*;
public class AK_03_Conditons{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        if(age>18) {
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
        */

        /*
        System.out.println("Enter no.:");
        int a = sc.nextInt();
        if(a%2==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Not even");
        }
        */

        System.out.print("Enter first no.:");
        int a = sc.nextInt();
        System.out.print("Enter second no.:");
        int b = sc.nextInt();
        if(a==b) {
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("A is lesser");
        }
    }    
}