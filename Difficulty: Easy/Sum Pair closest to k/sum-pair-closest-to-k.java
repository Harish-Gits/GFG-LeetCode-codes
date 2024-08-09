//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int[] ans = ob.sumClosest(arr, k);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution
{
    int[] sumClosest(int[] arr, int k)
    {
        int ans[]=new int[2];
        int cc=Integer.MAX_VALUE;
        int st=0,end=arr.length-1;
        
        while(st<end)
        {
            int cs=arr[st]+arr[end];
            int cd=Math.abs(cs-k);
            if(cd<cc || cd==cc && Math.abs(arr[st]-arr[end]) > Math.abs(ans[0]-ans[1]))
            {
                cc=cd;
                ans[0]=arr[st];
                ans[1]=arr[end];
            }
            if(cs < k)
                st++;
            else
                end--;
        }
        return ans;
    }
}