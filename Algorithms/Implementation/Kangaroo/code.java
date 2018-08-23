import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    static int pos1 = 0;
    static int pos2 = 0;
    static int jump1 = 0;
    static int jump2 = 0;
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        
        if(x1 > x2 && v1 > v2 || x1<x2 && v1<v2){
            return "NO";
        }
        
        if(x1>x2){
            pos1 = x1;
            pos2 = x2;
            jump1 = v1;
            jump2 = v2;
        }
        else{
            pos1 = x2;
            pos2 = x1;
            jump1 = v2;
            jump2 = v1;
        }
        
        
        while(pos1 >= pos2){
            
            if(pos1 == pos2){
                return "YES";
            }
            
            pos1 = pos1 + jump1;
            pos2 = pos2 + jump2;
            
        }

        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
