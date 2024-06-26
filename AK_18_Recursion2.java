package apna_collage;
public class AK_18_Recursion2 {
    /*
    public static void towerOfHonoi( int n , String source, String helper, String dest ) {
        // compexcity of towerof hanoi is O(2^n -1)~= O(2^n)
        if(n==1) {
            System.out.println("Transfer disk "+ n + " from "+ source + " to " +dest);
            return;
        }
        towerOfHonoi(n-1,source, dest, helper);// Transfer from source to helper
        System.out.println("Transfer disk " + n + " from "+ source + " to " + dest);
        towerOfHonoi(n-1, helper, source, dest);
    }

        public static void main(String[] args) {
        int n = 3;
        towerOfHonoi(n, "S", "H", "D");
    }
    */
//---------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------
    
    public static void printReverse(String str, int idx) {
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printReverse(str, idx-1);
    }
    public static void main(String[] args) {
        String str= "abcd";
        printReverse(str, str.length()-1);
    }
    
//---------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------

}