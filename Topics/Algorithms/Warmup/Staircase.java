import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
        for (int i = 0; i<n; i++) {
            int numSpaces = n-1-i;
            String temp = "";
            for (int j = 0; j<numSpaces; j++) {
                temp+=" ";
            }
            for (int k = 0; k<(n-numSpaces);k++) {
                temp+="#";
            }
            System.out.println(temp);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
