//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Solution ob = new Solution();
            int ans = ob.findElement(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java


class Solution {
    public int findElement(List<Integer> arr)
    {
        int n = arr.size();
        if (n < 3) return -1; 

        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], arr.get(i-1));
        }


        rightMin[n-1] = Integer.MAX_VALUE;
        for (int i = n-2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i+1], arr.get(i+1));
        }

        for (int i = 1; i < n-1; i++) {
            if (arr.get(i) > leftMax[i] && arr.get(i) < rightMin[i]) {
                return arr.get(i);
            }
        }
        return -1;
    }
}
