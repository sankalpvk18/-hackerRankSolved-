import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        char[] charcount1 = new char[26];
        char[] charcount2 = new char[26];
        
        int offset;
        int code;
        int sum = 0;
        
        for(int i = 0; i<a.length() ; i++){
            offset = (int)'a';
            code = a.charAt(i) - offset;
            charcount1[code]++;
        }
        
         for(int i = 0; i<b.length() ; i++){
            offset = (int)'a';
            code = b.charAt(i) - offset;
            charcount2[code]++;
        }
        
        for(int j = 0; j < 26 ; j++){
            sum = sum + Math.abs(charcount1[j]-charcount2[j]);
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
