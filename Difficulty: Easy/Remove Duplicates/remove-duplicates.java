//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDups(String str)
    {
        List<Character> l=new ArrayList<>();
        char[] S=str.toCharArray();
        for(char c:S)
        {
            if(!l.contains(c))
            {
                l.add(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:l)
            sb.append(c);
        return sb.toString();
    }
}