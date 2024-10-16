//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        if(arr.length==1)
            return new String[]{arr[0],"1"};
        int count=0;
        int maxv=0;
        String mstr="";
        Map<String,Integer> map=new HashMap<>();
        for(String str:arr)
            map.put(str,map.getOrDefault(str,0)+1);
        for(String str:map.keySet())
        {
            count=map.get(str);
            if(count>maxv || (count==maxv && str.compareTo(mstr)<0))
            {
                maxv=count;
                mstr=str;
            }
        }
        return new String[]{mstr,String.valueOf(maxv)};
    }
}

