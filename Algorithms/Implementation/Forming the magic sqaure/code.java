import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {

        int max = 0;
        int[] cost = new int[8];
        
          int pre[][] = {
                                {4,9,2,3,5,7,8,1,6},
                                {4,3,8,9,5,1,2,7,6},
                                {2,9,4,7,5,3,6,1,8},
                                {2,7,6,9,5,1,4,3,8},
                                {8,1,6,3,5,7,4,9,2},
                                {8,3,4,1,5,9,6,7,2},
                                {6,7,2,1,5,9,8,3,4},
                                {6,1,8,7,5,3,2,9,4}, 
                            };
        
        int min_cost = 81;

        for(int i=0;i<8;i++){
                int j=0;
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        cost[i] = cost[i]+Math.abs(pre[i][j]-s[k][l]);
                        j++;
                    }
                }
        }
        
        Arrays.sort(cost);        
        return cost[0];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
