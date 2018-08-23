import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int diag1_sum = 0, diag2_sum = 0;
    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        
        for(int i=0; i<arr.length; i++){
            for(int j=0 ; j<arr.length; j++){
                if(i==j){
                    diag1_sum = diag1_sum + arr[i][j];
                }
            }
        }
            
        int k = arr.length;
        int p=0, q = k-1;
        while(p!=arr.length && q!=-1){
            diag2_sum = diag2_sum + arr[p][q];
            p++; 
            q--;
        }
        
        return Math.abs(diag1_sum - diag2_sum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
