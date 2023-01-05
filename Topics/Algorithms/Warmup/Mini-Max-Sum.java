import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        //System.out.println(arr);
        System.out.print(Long.valueOf(arr.get(0))+Long.valueOf(arr.get(1))+Long.valueOf(arr.get(2))+Long.valueOf(arr.get(3)));
        System.out.print(" ");
        System.out.print(Long.valueOf(arr.get(1))+Long.valueOf(arr.get(2))+Long.valueOf(arr.get(3))+Long.valueOf(arr.get(4)));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
