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
        Set<Character> set=new HashSet<>();
        int st=0;
        int maxLen=1;
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            while(set.contains(ch))
            {
                set.remove(S.charAt(st));
                st++;
            }
            set.add(ch);
            maxLen=Math.max(maxLen,i-st+1);
        }
        return maxLen;
    }
}