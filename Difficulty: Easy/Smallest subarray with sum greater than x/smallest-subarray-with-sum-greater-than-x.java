//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while (T > 0) {
            int x = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split(" ");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

            Solution solution = new Solution();
            System.out.println(solution.smallestSubWithSum(x, arr));

            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr)
    {
        int sa=arr.length+1;
        int cs=0;
        int st=0;
        for(int i=0;i<arr.length;i++)
        {
            cs+=arr[i];
            while(cs>x)
            {
                sa=Math.min(sa,i-st+1);
                cs-=arr[st];
                st++;
            }
        }
        return sa==arr.length+1?0:sa;
    }
}
