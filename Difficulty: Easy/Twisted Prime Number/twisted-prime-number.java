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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isTwistedPrime(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isTwistedPrime(int N)
    {
        int tw=0;
        int t=N;
        while(t>0)
        {
            int r=t%10;
            tw=tw*10+r;
            t/=10;
        }
        if(isPrime(N) && isPrime(tw))
            return 1;
        return 0;
    }
    boolean isPrime(int n)
    {
        if(n==1 || n==0)
            return true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}