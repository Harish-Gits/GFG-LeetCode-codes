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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        int maxLen=1;
        int l=0;
        Set<Character> seen=new HashSet<>();
        for(int r=0;r<S.length();r++)
        {
            char ch=S.charAt(r);
            while(seen.contains(ch))
            {
                seen.remove(S.charAt(l));
                l++;
            }
            seen.add(ch);
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}