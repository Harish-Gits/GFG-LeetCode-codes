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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    static int evenlyDivides(int N)
    {
       int count=0;
       int temp=N;
       while(N>0)
       {
            int d=N%10;
            if(d!=0 && temp%d==0)
                count++;
            N/=10;
       }
       return count;
    }
}