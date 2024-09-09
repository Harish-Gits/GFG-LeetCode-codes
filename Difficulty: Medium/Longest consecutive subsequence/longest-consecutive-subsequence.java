//{ Driver Code Starts
//Initial Template for Java

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass
{
    // Driver Code
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    out.println(new Solution().findLongestConseqSubseq(a, n));
		    t--;
		}
		out.close();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   
	static int findLongestConseqSubseq(int arr[], int N)
	{
	    if(N==0)
	        return 0;
	    Set<Integer> st=new HashSet<>();
	    int lcs=1;
	    for(int d:arr)
	        st.add(d);
	    for(int i=0;i<N;i++)
	    {
	        int num=arr[i];
	        if(st.contains(num-1))
	            continue;
	        int cc=1;
	        while(st.contains(num+1))
	        {
	            cc++;
	            num++;
	        }
	        lcs=Math.max(cc,lcs);
	    }
	    return lcs;
	}
}