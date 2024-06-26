package apna_collage;
import java.util.*;
public class AK_08_PracticeQuestions {
//----------------------------------------------------------------- 
//-----------------------------------------------------------------     
    /*
    public static void printAverage(int a, int b, int c) {
        double average= (a+b+c)/3;
        System.out.println("Average of three numbers is: " + average );
        return;
        }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter first no. : ");
        int l = sc.nextInt();
        System.out.print(" Enter second no. : ");
        int m = sc.nextInt();
        System.out.print(" Enter third no. : ");
        int n = sc.nextInt();
        printAverage(l, m, n);
    }
    */
//-----------------------------------------------------------------
//-----------------------------------------------------------------
    /*
    public static void printGreater(int a, int b) {
        if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter first no. : ");
        int n = sc.nextInt();
        System.out.print(" Enter second no. : ");
        int m = sc.nextInt();
        printGreater(n, m);
    }*/
//-----------------------------------------------------------------
//-----------------------------------------------------------------     

    /*
    public static void printCircumference(int a) {
        double cir= 2 * 3.14 * a;
        System.out.println("Circumference of circle is: "+cir);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter radius of circle. : ");
        int r = sc.nextInt();
        printCircumference(r);
    }
    */
//-----------------------------------------------------------------
//----------------------------------------------------------------- 
   /*
    public static void printVoteCheck(int age) {
        if(age<18){
            System.out.println("Person is not eligible to vote");
        }
        else{
            System.out.println("Person is eligible to vote");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int a= sc.nextInt();
        printVoteCheck(a);

    }
    */
//-----------------------------------------------------------------
//----------------------------------------------------------------- 
    /*
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println(i);
        }
        while(i<11);
    }
    */
//-----------------------------------------------------------------
//----------------------------------------------------------------- 

public static void printValue( int a , int b) {
    double power= Math.pow(a, b);
    System.out.println("Value of the question is; "+ power);
    return;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Exponent x: ");
    int x= sc.nextInt();
    System.out.print("Enter power n: ");
    int n= sc.nextInt();
    printValue(x,n);
    }
}
//-----------------------------------------------------------------
//^^^^^^^^^^^^^^^^^^^^^^^^^END^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//----------------------------------------------------------------- 
      
