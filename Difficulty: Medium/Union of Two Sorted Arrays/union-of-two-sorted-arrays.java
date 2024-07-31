//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t  =Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);
            
            int arr1[] = new int[N];
            int arr2[] = new int[M];
            
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
              arr1[i] = Integer.parseInt(st[i]);
            
            st = read.readLine().trim().split(" ");  
            for(int i = 0; i< M; i++)
              arr2[i] = Integer.parseInt(st[i]);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.findUnion(arr1, arr2, N, M);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println(); 
        }
    }
}



// } Driver Code Ends


//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays

class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        int p1 = 0, p2 = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) {
                if (seen.add(arr1[p1])) {
                    ans.add(arr1[p1]);
                }
                p1++;
            } else if (arr1[p1] > arr2[p2]) {
                if (seen.add(arr2[p2])) {
                    ans.add(arr2[p2]);
                }
                p2++;
            } else {
                if (seen.add(arr1[p1])) {
                    ans.add(arr1[p1]);
                }
                p1++;
                p2++;
            }
        }

        while (p1 < arr1.length) {
            if (seen.add(arr1[p1])) {
                ans.add(arr1[p1]);
            }
            p1++;
        }

        while (p2 < arr2.length) {
            if (seen.add(arr2[p2])) {
                ans.add(arr2[p2]);
            }
            p2++;
        }

        return ans;
    }
}




