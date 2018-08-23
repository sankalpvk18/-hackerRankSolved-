import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the getTotalX function below.
     */
    static int count2 = 0, count3 = 0, count4 = 0;
    static int getTotalX(int[] a, int[] b) {
        

        Arrays.sort(a);
        Arrays.sort(b);
        int x = 0, s=0;
        
        while(x<b[0]){
                
                x = x+a[a.length-1];
                
                for(int i=0; i<a.length; i++){
                    if(x % a[i] == 0){
                        count4++;
                    }
                }
                
                if(count4 == a.length){
                    for(int j=0; j<b.length;j++){
                        if(b[j] % x == 0){
                            count2++;
                        }
                    }
                }
                
                if(count2 == b.length){
                    count3++;
                }
                count2=0;
                count4=0;
                s++;
        }

        
        return count3;
}

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}
