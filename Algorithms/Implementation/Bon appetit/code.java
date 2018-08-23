import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int total = 0; 
    
    public static String billSplit(int n, int k, int[] prices, int b){
        
        for(int i = 0; i<prices.length; i++){
            if(i!=k){
                total = total + prices[i];
            }
        }
        int result = b - (total/2);
        if( b!=(total/2)){
            return Integer.toString(result);
        }
        else{
            return "Bon Appetit";
        }
    }
    
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        
        String[] priceofItem = scanner.nextLine().split(" ");
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] prices = new int[n];
        
        for(int i =0; i<n; i++){
            int priceItem = Integer.parseInt(priceofItem[i]);
            prices[i] = priceItem;
        }
        
        int b = scanner.nextInt();
    
        System.out.println(billSplit(n, k, prices, b));
        
    }
}
