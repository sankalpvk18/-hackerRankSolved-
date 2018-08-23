import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        
        int count = 0;
        char ch;
        int down = -1;
        int up = 1;
        int[] steps = new int[s.length()];
        
        for(int i = 0; i< s.length()-1; i++){
            ch = s.charAt(i);
            if(ch == 'U'){
                count++;
                steps[i] = count;     //up
            }
            else{
                count--;
                steps[i] = count;   //down
            }
        }
    
        int min = 0;
        
        for(int i=1; i<steps.length; i++){
            if(steps[i]==0 && steps[i-1]!=1){
                min++;   //count++
            }
        }

        return min;   //count
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
