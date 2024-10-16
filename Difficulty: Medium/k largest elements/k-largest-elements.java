//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int[] ans = new Solution().kLargest(arr, n, k);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    int[] kLargest(int[] arr, int n, int k)
    {
        PriorityQueue<Integer> mh=new PriorityQueue<>();
        for(int i=0;i<k;i++)
            mh.add(arr[i]);
        for(int i=k;i<n;i++)
        {
            if(arr[i]>mh.peek())
            {
                mh.poll();
                mh.add(arr[i]);
            }
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
            ans[i]=mh.poll();
        for(int i=0;i<k/2;i++)
        {
            int temp=ans[i];
            ans[i]=ans[k-1-i];
            ans[k-1-i]=temp;
        }
        return ans;
    }
}