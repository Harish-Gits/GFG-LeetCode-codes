//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int A[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                A[i] = Integer.parseInt(inputLine[i]);
            }
            int p = 0;
            for(int i=0; i<n-1; i++)
                p += Math.max(0,A[i+1]-A[i]);
                
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer> > ans = obj.stockBuySell(A, n);
            if(ans.size()==0)
                System.out.print("No Profit");
            else{
                int c=0;
                for(int i=0; i<ans.size(); i++)
                    c += A[ans.get(i).get(1)]-A[ans.get(i).get(0)];
                
                if(c==p)
                    System.out.print(1);
                else
                    System.out.print(0);
            }System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    // Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        int i = 0;
        while (i < n - 1) {
            // Find the next local minimum
            while (i < n - 1 && A[i + 1] <= A[i]) {
                i++;
            }
            
            // If reached the end, no more transactions possible
            if (i == n - 1) break;
            
            int buy = i++;
            
            // Find the next local maximum
            while (i < n && A[i] >= A[i - 1]) {
                i++;
            }
            
            int sell = i - 1;
            
            // Add the buy and sell days to result
            ArrayList<Integer> transaction = new ArrayList<>();
            transaction.add(buy);
            transaction.add(sell);
            result.add(transaction);
        }
        
        return result;
    }
}

