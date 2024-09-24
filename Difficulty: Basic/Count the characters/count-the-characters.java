//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int n = sc.nextInt();

    		System.out.println (new Sol().getCount (s, n)); 
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int getCount (String S, int N)
    {
        int count=0;
        Map<Character,Integer> map=new HashMap<>();
        map.put(S.charAt(0),1);
        for(int i=1;i<S.length();i++)
        {
            if(S.charAt(i)!=S.charAt(i-1))
                map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
        }
        for(int v:map.values())
        {
            if(v==N)
                count++;
        }
        return count;
    }
}