import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String result = "";
            int num = 0;
            for (int j = 0; j < n; j++) {
                if (j==0) {
                    num+=a+(Math.pow(2,j))*b;
                    result+=(num+" ");
                } else if (j==n+1) {
                    num+=(Math.pow(2,j))*b;
                    result+=(num);
                } else {
                    num+=(Math.pow(2,j))*b;
                    result+=(num+" ");
                }
                
            }
            System.out.println(result);
        }
        in.close();
    }
}
