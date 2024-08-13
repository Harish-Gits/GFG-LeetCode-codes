//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution
{

    int search(String s1, String s2)
    {
        int count=0;
        Map<Character,Integer> need=new HashMap<>();
        Map<Character,Integer> have=new HashMap<>();
        
        for(char c:s1.toCharArray())
            need.put(c,need.getOrDefault(c,0)+1);
        
        int st=0,end=0;
        
        while(end<s2.length())
        {
            char ch=s2.charAt(end);
            
            if(!need.containsKey(ch))
            {
                end++;
                st=end;
                have.clear();
                continue;
            }
            have.put(ch,have.getOrDefault(ch,0)+1);
            while(have.get(ch)>need.get(ch))
            {
                char cha=s2.charAt(st);
                have.put(cha,have.get(cha)-1);
                st++;
            }
            int ws=end-st+1;
            if(ws==s1.length())
                count++;
            end++;
        }
        return count;
    }
}