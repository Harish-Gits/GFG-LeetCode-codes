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
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.longestPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestPalindrome(String S)
    {
        String ans="";
        int maxLen=Integer.MIN_VALUE;
        for(int i=0;i<S.length();i++)
        {
            int l=i,r=i;
            while(l>=0 && r<S.length() && S.charAt(l)==S.charAt(r))
            {
                if(maxLen<r-l+1)
                {
                    maxLen=r-l+1;
                    ans=S.substring(l,r+1);
                }
                l--;
                r++;
            }
            l=r=i;
            r++;
            while(l>=0 && r<S.length() && S.charAt(l)==S.charAt(r))
            {
                if(maxLen<r-l+1)
                {
                    maxLen=r-l+1;
                    ans=S.substring(l,r+1);
                }
                l--;
                r++;
            }
        }
        return ans;
    }
}