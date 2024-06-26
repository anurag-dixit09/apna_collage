package apna_collage;
import java.util.*;

public class AK_07_Functions {
    
    //---------------------------------------------------------------------
    /*-----------------------------------------------------------------------
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. :");
        int a = sc.nextInt();
        System.out.print("Enter second no. :");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("sum of two No. is:"+sum);
    }
    */

    //--------------------------------------------------------------
    /*-------------------------------------------------------------
    public static int calculateProduct(int a, int b) {
        return a * b;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. :");
        int a = sc.nextInt();
        System.out.print("Enter second no. :");
        int b = sc.nextInt();
        int sum = calculateProduct(a , b);
        System.out.println("Product of two No. is: "+sum);
    }
    */
    //-------------------------------------------------------------------------
    //-------------------------------------------------------------------------
    public static void printFactorial(int n) {
        
        if(n<0) {
            System.out.println("Invalid no.");
            return;
        }
        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial = factorial *i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int a = sc.nextInt();
        printFactorial(a);
        
    }
}
//-----------------------------END---------------------------------------    