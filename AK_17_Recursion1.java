package apna_collage;
import java.util.*;
public class AK_17_Recursion1 {
    /*
    public static void printNumbers(int n) {
        
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }
    public static void main(String[] args) {
        int a = 1;
        printNumbers(a);
    }
    */
//----------------------------------------------------------------------------------
//----------------------------------------------------------------------------------
    /*
    public static void printSum( int i, int n, int sum ) {
        if(i==n) { // base condition
            sum+=i;// sum = sum+1
            System.out.println(sum);
            return;
        }
        sum +=i; // work done  1st thing
        printSum(i+1, n, sum);
        System.out.println(i);
    }

    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
    */
//----------------------------------------------------------------------------------
//----------------------------------------------------------------------------------
    /*
    public static int calcfactorial(int n) {
        if(n==1 || n==0){ // base case
            return 1;
        }
        int fact_nm1=calcfactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int a = 5;
        int ans = calcfactorial(a);
        System.out.println(ans);
    }
    */
//----------------------------------------------------------------------------------
//----------------------------------------------------------------------------------
    // fibonacci serios till n term
    // to create the next term a,b,c : c= a+b 
    /*
    public static void printFib(int a , int b, int n) {
    // a is second last term
    // b is last tearm
    if(n==0){
        return;
    }
    int c= a+b;
    System.out.println(c);
    printFib(b, c, n-1); 
}
public static void main(String[] args) {
    int a = 0 ; int b = 1;
    System.out.println(a);
    System.out.println(b);
    int n = 7;
    printFib(a, b, n-2);
    }
    */
//----------------------------------------------------------------------------------
//----------------------------------------------------------------------------------
    
    /*
    public static int calcPower(int x, int n ) {
        if(n==0) {
            return 1;
        }
        if(x==0) {
            return 0;
        }
        int xPower1 = calcPower(x, n-1);
        int xpower = x* xPower1;
        return xpower;

    }
    public static void main(String[] args) {
        int x=2 , n = 5;
        int ans= calcPower(x, n);
        System.out.println(ans);
    }
    */
//----------------------------------------------------------------------------------
//----------------------------------------------------------------------------------
    /*
    public static int calcPower(int x, int n ) {
    if(n==0) {
        return 1;
    }
    if(x==0) {
        return 0;
    }
    // if n is even 
    if(n%2==0) {
        return calcPower(x, n/2) * calcPower(x, n/2);
    }
    else{
        // n is odd
        return calcPower(x, n/2) * calcPower(x, n/2) * x;
    }
}
    public static void main(String[] args) {
    int x=2 , n = 5;
    int ans= calcPower(x, n);
    System.out.println(ans);
    }
    */
//----------------------------------------------------------------------------------
//----------------------------------------------------------------------------------

}