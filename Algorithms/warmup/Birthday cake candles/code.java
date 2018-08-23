import java.io.*;
import java.math.*;
import java.security.*; 
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static long count = 0;
    static int max_index = 0;
    
    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        
        long max_height = ar[0];
        long n = ar.length;
        
        for(int i=1; i<n; i++){
            if(ar[i]>max_height){
                max_height = ar[i];
                max_index = i;
            }
        }
        
        for(int j=0; j<n; j++){
            if(ar[j]==max_height){
                count++;
            }
        }
    
        return (int)count;
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
