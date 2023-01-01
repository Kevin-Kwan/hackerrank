import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String answer = "Yes";
        for (int i = 0; i<(A.length()-(A.length()/2));i++) {
            if (A.charAt(i)!=A.charAt(A.length()-1-i)) {
                answer = "No";
                break;
            }
        }
        System.out.println(answer);
    }
}
