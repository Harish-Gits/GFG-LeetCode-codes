//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(n, a);
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java


class Solution {

    ArrayList<Integer> findSubarray(int n, int a[]) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;  // Initialize maxi with the smallest possible integer
        int j = 0;
        int r = -1, l = -1;  // Use -1 to mark uninitialized values
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                sum += a[i];
                if (sum > maxi || (sum == maxi && (i - j > r - l))) {
                    maxi = sum;
                    l = j;
                    r = i;
                }
            } else {
                sum = 0;
                j = i + 1;
            }
        }
        
        if (l != -1 && r != -1) {  // If valid subarray found
            for (int i = l; i <= r; i++) {
                ans.add(a[i]);
            }
        } else {
            ans.add(-1);  // If no valid subarray is found
        }
        
        return ans;
    }
}
