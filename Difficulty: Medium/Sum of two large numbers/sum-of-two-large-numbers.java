//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x, y);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String findSum(String X, String Y) {
        // Reverse the input strings to make addition easier
        X = new StringBuilder(X).reverse().toString();
        Y = new StringBuilder(Y).reverse().toString();
        
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int maxLength = Math.max(X.length(), Y.length());
        
        for (int i = 0; i < maxLength; i++) {
            int digitX = i < X.length() ? X.charAt(i) - '0' : 0;
            int digitY = i < Y.length() ? Y.charAt(i) - '0' : 0;
            
            int sum = digitX + digitY + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }
        
        if (carry != 0) {
            result.append(carry);
        }
        
        // Reverse the result to get the final sum
        result.reverse();
        
        // Remove leading zeros if any
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        
        return result.toString();
    }
}
