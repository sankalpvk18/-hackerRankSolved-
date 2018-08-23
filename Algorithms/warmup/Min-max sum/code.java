import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int min, max;
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        
        min = arr[0];
        max = arr[0];
        int max_index=0;
        int min_index=0;
        long min_sum=0;
        long max_sum=0;
        
        for(int i=0; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                max_index=i;
            }
            else if(arr[i]<min){
                min = arr[i];
                min_index = i;
            }
            else{
                max = max; 
                min = min;
            }
        }
        
        for(int j=0; j<arr.length; j++){
            if(j!=max_index){
                min_sum = min_sum + arr[j];
            }
            if(j!=min_index){
                max_sum = max_sum + arr[j];
            }
        }
        
        System.out.println(min_sum + " " + max_sum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
