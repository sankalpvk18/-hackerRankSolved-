import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int[] ar) {
        
        int maxCount = 0;
        int count = 0;
        int type1=0, type2=0, type3=0, type4=0, type5 = 0;
        int[] br = new int[5];
        Arrays.sort(ar);    
        
        
        for(int j = 0; j< ar.length; j++){
            if(ar[j] == 1){
                type1++;
                br[0] = type1;
            }
            if(ar[j] == 2){
                type2++;
                br[1] = type2;
            }
            if(ar[j] == 3){
                type3++;
                br[2] = type3;
            }
            if(ar[j] == 4){
                type4++;
                br[3] = type4;
            }
            if(ar[j] == 5){
                type5++;
                br[4] = type5;
            }
        }
        
        // Arrays.sort(br);
        for(int k = 0; k<br.length; k++){
            if(br[k]>maxCount){
                maxCount = br[k];
                count = k+1;
            }
        }
        
        return count;
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

        int result = migratoryBirds(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
