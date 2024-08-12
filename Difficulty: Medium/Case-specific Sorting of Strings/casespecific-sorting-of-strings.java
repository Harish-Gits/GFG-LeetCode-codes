//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        int[] lc=new int[26];
        int[] uc=new int[26];
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch))
                lc[ch-'a']++;
            else
                uc[ch-'A']++;
        }
        int l=0,u=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch))
            {
                while(lc[l]==0)
                    l++;
                sb.append((char)(l+'a'));
                lc[l]--;
            }
            else
            {
               while(uc[u]==0)
                    u++;
                sb.append((char)(u+'A'));
                uc[u]--;
            }
        }
        return sb.toString();
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends