import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int maxScore =0, minScore = 0, maxChange = 0, minChange = 0;
    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        
        maxScore = scores[0];
        minScore = scores[0];
        
        for(int i = 0; i<scores.length; i++){
            if(scores[i]>maxScore){
                maxScore = scores[i];
                maxChange++;
            }
            if(scores[i]<minScore){
                minScore = scores[i];
                minChange++;
            }
        }
        
        int[] show = new int[2];
        show[0] = maxChange;
        show[1] = minChange;
        
        return show;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
