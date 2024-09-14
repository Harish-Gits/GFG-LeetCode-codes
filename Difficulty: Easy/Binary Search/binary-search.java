//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // consume the newline
            String input = sc.nextLine();
            String[] strNumbers = input.split(" ");
            int[] arr = new int[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                arr[i] = Integer.parseInt(strNumbers[i]);
            }
            Solution ob = new Solution();
            int res = ob.binarysearch(arr, k);
            System.out.println(res);
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution
{
    public static int bs(int[] arr,int low,int high,int k)
    {
        if(low>high)
            return -1;
        int mid=(low+high)/2;
        if(arr[mid]==k)
            return mid;
        else if(arr[mid]<k)
            return bs(arr,mid+1,high,k);
        return bs(arr,low,mid-1,k);
    }
    public int binarysearch(int[] arr, int k)
    {
        int low=0,high=arr.length-1;
        int ans=bs(arr,low,high,k);
        return ans;
    }
}