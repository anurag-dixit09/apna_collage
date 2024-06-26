package apna_collage;
import java.util.*;
public class AK_05_Patterns {
    public static void main(String[] args) {
        /*
        -----------------------input by user-----------------------------
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. : ");
        int n = sc.nextInt();
        */

        //---------------------QUESTION 2--------------------------------
        // NESTR LOOP = LOOP INSIDE LOOP IS CALLED NESTER LOOP
        /*
        int n=4;
        int m= 5;

        for(int i= 1; i<=n; i++) {
            for(int j =1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //---------------------QUESTION 2---------------------------------
        /*
        int n=4;
        int m= 5;
        for(int i=1;i<=n;i++) {
            for(int j=1; j<=m; j++)
            if(i==1 || j==1|| i==n|| j==m) {
                System.out.print("*");
            }else{
                System.out.println(" ");
            }
            System.out.println();
        }
        */
        //-------------------QUESTION 3-----------------------------------
        /*
        int n=4;
        for(int i=1;i<=n;i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //-------------------QUESTION 4-----------------------------------
        /*
        int n=4;
        for(int i=n;i>=1;i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //-------------------QUESTION 5--------------------------------------
        /*
        int n=4;
        for(int i=n;i>=1;i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //-------------------QUESTION 6--------------------------------------
        /*
        int n=4;
        for(int i=1;i<=n;i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j= 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
          //-------------------QUESTION 7--------------------------------------
        int n=5;
        for(int i=1;i<=n;i++) {
            for(int j=1; j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}