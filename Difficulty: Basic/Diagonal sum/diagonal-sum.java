//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.DiagonalSum(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




class Solution
{
    public int DiagonalSum(int[][] matrix)
    {
        int n=matrix.length;
        int i=0,j=0,sum=0;
        while(i<n)
        {
            sum+=matrix[i][j];
            i++;
            j++;
        }
        i=0;
        j=n-1;
        while(i<n)
        {
            sum+=matrix[i][j];
            i++;
            j--;
        }
        return sum;
        
    }
}