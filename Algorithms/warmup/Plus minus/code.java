import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double count_neg = 0, count_pos = 0, count_zero = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>0){
                count_pos++;
            }
            else if (arr[i]==0){
                count_zero++;
            }
            else{
                count_neg++;
            }
        }
        System.out.println(count_pos/arr.length);
        System.out.println(count_neg/arr.length);
        System.out.println(count_zero/arr.length);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
