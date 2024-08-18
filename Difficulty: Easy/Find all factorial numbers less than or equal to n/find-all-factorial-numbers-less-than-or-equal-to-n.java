//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution
{
    static ArrayList<Long> factorialNumbers(long n)
    {
        ArrayList<Long> ans=new ArrayList<>();
        int i=1;
        long curfact=1;
        while(curfact<=n)
        {
            ans.add(curfact);
            i++;
            curfact=fact(i);
        }
        return ans;
    }
    static long fact(int i)
    {
        if(i==0 || i==1)
            return 1;
        return i*fact(i-1);
    }
}