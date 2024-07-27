//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            String b = input[1];
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String addBinary(String A, String B) {
        int alen = A.length() - 1;
        int blen = B.length() - 1;
        int carry = 0;
        int sum = 0;
        StringBuilder ans = new StringBuilder();
        
        while (alen >= 0 || blen >= 0 || carry != 0) {
            int x = 0;
            if (alen >= 0) {
                x = A.charAt(alen) - '0';
                alen--;
            }
            int y = 0;
            if (blen >= 0) {
                y = B.charAt(blen) - '0';
                blen--;
            }
            sum = x + y + carry;
            ans.append(sum % 2);
            carry = sum / 2;
        }
        while (ans.length() > 1 && ans.charAt(ans.length() - 1) == '0') {
            ans.setLength(ans.length() - 1);
        }
        return ans.reverse().toString();
    }
}