//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends
class Solution
{
    int longestUniqueSubsttr(String S)
    {
        int st=0,end=0;
        int maxLen=Math.min(S.length(),1);
        Set<Character> seen=new HashSet<>();
        
        while(end<S.length())
        {
            char c=S.charAt(end);
            while(seen.contains(c))
            {
                seen.remove(S.charAt(st));
                st++;
            }
            seen.add(c);
            maxLen=Math.max(maxLen,end-st+1);
            end++;
        }
        return maxLen;
    }
}